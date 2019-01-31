package com.ch.stornet.modules.stornet.service.impl;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;


import com.ch.stornet.modules.stornet.dao.SnMgmtAccInfoDao;
import com.ch.stornet.modules.stornet.entity.SnMgmtAccInfoEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtAccInfoService;


@Service("snMgmtAccInfoService")
public class SnMgmtAccInfoServiceImpl extends ServiceImpl<SnMgmtAccInfoDao, SnMgmtAccInfoEntity> implements SnMgmtAccInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnMgmtAccInfoEntity> page = this.selectPage(
                new Query<SnMgmtAccInfoEntity>(params).getPage(),
                new EntityWrapper<SnMgmtAccInfoEntity>()
        );

        return new PageUtils(page);
    }

}
