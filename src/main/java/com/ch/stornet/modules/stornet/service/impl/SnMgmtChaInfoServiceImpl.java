package com.ch.stornet.modules.stornet.service.impl;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.ch.stornet.modules.stornet.dao.SnMgmtChaInfoDao;
import com.ch.stornet.modules.stornet.entity.SnMgmtChaInfoEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtChaInfoService;


@Service("snMgmtChaInfoService")
public class SnMgmtChaInfoServiceImpl extends ServiceImpl<SnMgmtChaInfoDao, SnMgmtChaInfoEntity> implements SnMgmtChaInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnMgmtChaInfoEntity> page = this.selectPage(
                new Query<SnMgmtChaInfoEntity>(params).getPage(),
                new EntityWrapper<SnMgmtChaInfoEntity>()
        );

        return new PageUtils(page);
    }

}
