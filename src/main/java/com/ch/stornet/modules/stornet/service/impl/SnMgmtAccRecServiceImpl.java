package com.ch.stornet.modules.stornet.service.impl;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;


import com.ch.stornet.modules.stornet.dao.SnMgmtAccRecDao;
import com.ch.stornet.modules.stornet.entity.SnMgmtAccRecEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtAccRecService;


@Service("snMgmtAccRecService")
public class SnMgmtAccRecServiceImpl extends ServiceImpl<SnMgmtAccRecDao, SnMgmtAccRecEntity> implements SnMgmtAccRecService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnMgmtAccRecEntity> page = this.selectPage(
                new Query<SnMgmtAccRecEntity>(params).getPage(),
                new EntityWrapper<SnMgmtAccRecEntity>()
        );

        return new PageUtils(page);
    }

}
