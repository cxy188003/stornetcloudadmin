package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnOlUserFarmDao;
import com.ch.stornet.modules.stornet.entity.SnOlUserFarmEntity;
import com.ch.stornet.modules.stornet.service.SnOlUserFarmService;


@Service("snOlUserFarmService")
public class SnOlUserFarmServiceImpl extends ServiceImpl<SnOlUserFarmDao, SnOlUserFarmEntity> implements SnOlUserFarmService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnOlUserFarmEntity> page = this.selectPage(
                new Query<SnOlUserFarmEntity>(params).getPage(),
                new EntityWrapper<SnOlUserFarmEntity>()
        );

        return new PageUtils(page);
    }

}
