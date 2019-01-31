package com.ch.stornet.modules.stornet.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.R;
import com.ch.stornet.common.utils.UUIDGenerator;
import com.ch.stornet.modules.stornet.common.Constants;
import com.ch.stornet.modules.stornet.common.ErrorConstants;
import com.ch.stornet.modules.stornet.dao.*;

import com.ch.stornet.modules.stornet.entity.*;
import com.ch.stornet.modules.stornet.service.SnOlUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

@Service("SnOlUserInfoService")
public class SnOlUserInfoServiceImpl extends ServiceImpl<SnOlUserInfoDao, SnOlUserInfoEntity> implements SnOlUserInfoService {

    @Autowired
    private SnOlUserWalletDao snOlUserWalletDao;
    @Autowired
    private SnMgmtGenaccInfoDao snMgmtGenaccInfoDao;
    @Autowired
    private SnMgmtGenaccRecDao snMgmtGenaccRecDao;
    @Autowired
    private SnOlUserWalletRecDao snOlUserWalletRecDao;
    @Autowired
    private SnOlUserSpaceDao snOlUserSpaceDao;
    @Autowired
    private SnOlUserBuyDao snOlUserBuyDao;
    @Override
    public R recharge(String id,String isExamine,String examinDesc) {

        SnOlUserBuyEntity snOlUserBuyEntity = snOlUserBuyDao.selectById(id);
        if(snOlUserBuyEntity==null)
        { System.out.println("未取到订单");
            return R.error(-1,"订单不存在");
        }
        String userId =snOlUserBuyEntity.getUserId();
        String allowance = snOlUserBuyEntity.getPurchaseCount().toString();
        if(snOlUserBuyEntity.getDelFlag().equals("1"))
        {
            return R.error(-1,"记录已被删除");
        }

        if(isExamine==null||"".equals(isExamine))
        {
            return R.error(-1,"请传入审核是否通过");
        }
        if("2".equals(isExamine)) {
            snOlUserBuyEntity.setIsExamine(isExamine);
            snOlUserBuyEntity.setExaminTime(new Date().getTime());
            snOlUserBuyEntity.setExaminDesc(examinDesc);
            snOlUserBuyEntity.setExaminTime(new Date().getTime());
            snOlUserBuyEntity.setUpdateTime(new Date().getTime());
            snOlUserBuyDao.updateById(snOlUserBuyEntity);
        }
        if("3".equals(isExamine)) {
            snOlUserBuyEntity.setIsExamine(isExamine);
            snOlUserBuyEntity.setExaminTime(new Date().getTime());
            snOlUserBuyEntity.setExaminDesc(examinDesc);
            snOlUserBuyEntity.setExaminTime(new Date().getTime());
            snOlUserBuyEntity.setUpdateTime(new Date().getTime());
            snOlUserBuyDao.updateById(snOlUserBuyEntity);
            return R.ok("审核不通过");
        }

        //获取用户钱包信息
        SnOlUserWalletEntity userWallet = snOlUserWalletDao.selectByPrimaryKey(userId);
        String  walletAddress = userWallet.getAddress();

        // 更新用户钱包金额
        long balance =  userWallet.getAmount();
        //long currentBalance = balance + Integer.parseInt(allowance);
        long currentBalance = balance + new BigDecimal(allowance).intValue();
        userWallet.setAmount(currentBalance);
        int n = snOlUserWalletDao.updateByPrimaryKeySelective(userWallet);
        // 从水龙头减掉用户充值金额
        SnMgmtGenaccInfoEntity snMgmtGenaccInfo = snMgmtGenaccInfoDao.selectByHeadlessAddress(Constants.SNC_HEADLESS_ADDRESS);
        String headlessAddress = snMgmtGenaccInfo.getSncHeadlessAddress();
        long amount = snMgmtGenaccInfo.getSncTotalAmount();
        long currentAmount = amount - new BigDecimal(allowance).intValue();
        snMgmtGenaccInfo.setSncTotalAmount(currentAmount);
        int x = snMgmtGenaccInfoDao.updateByPrimaryKey(snMgmtGenaccInfo);

        // 记录水龙头交易信息
        SnMgmtGenaccRecEntity snMgmtGenaccRec = new SnMgmtGenaccRecEntity();
        snMgmtGenaccRec.setId(UUIDGenerator.getUUID());
        snMgmtGenaccRec.setTrType("2");
        snMgmtGenaccRec.setToAddress(walletAddress);
        snMgmtGenaccRec.setAmount(currentBalance);
        int y = snMgmtGenaccRecDao.insertSelective(snMgmtGenaccRec);

        // 记录用户充值信息
        SnOlUserWalletRecEntity snOlUserWalletRec = new SnOlUserWalletRecEntity();
        snOlUserWalletRec.setId(UUIDGenerator.getUUID());
        snOlUserWalletRec.setTrType("1");
        snOlUserWalletRec.setUserid(userId);
        snOlUserWalletRec.setIsExamine(isExamine);
        snOlUserWalletRec.setCreateTime(new Date().getTime());
        snOlUserWalletRec.setFromAddress(headlessAddress);
        snOlUserWalletRec.setAmount(currentBalance);
        int m = snOlUserWalletRecDao.insertSelective(snOlUserWalletRec);

        if(n == 1 && m == 1 && x == 1 && y == 1){
            return  R.ok("申请成功");
        }else {

            return  R.error(9000,ErrorConstants.RRRORMSG_RECHARGE_ERROR);
        }
    }

    @Override
    public R queryBalance(String userId) {
        // 查询用户钱包余额
        SnOlUserWalletEntity userWallet = snOlUserWalletDao.selectByPrimaryKey(userId);
        long totalBalance = userWallet.getAmount();
        return  R.ok().put("totalBalance",totalBalance);
    }

    @Override
    public R  queryRenterInfo(String userId) {
        SnOlUserSpaceEntity  snOlUserSpace = snOlUserSpaceDao.selectByUserId(userId);
        if(snOlUserSpace == null){
            return R.error(90003,ErrorConstants.ERRORMSG_NOT_BUY_SPACE);
        }
        return  R.ok().put("snOlUserSpace",snOlUserSpace);
    }
}
