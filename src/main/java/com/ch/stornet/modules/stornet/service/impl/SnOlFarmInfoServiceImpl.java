package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnOlFarmInfoDao;
import com.ch.stornet.modules.stornet.entity.SnOlFarmInfoEntity;
import com.ch.stornet.modules.stornet.service.SnOlFarmInfoService;


@Service("snOlFarmInfoService")
public class SnOlFarmInfoServiceImpl extends ServiceImpl<SnOlFarmInfoDao, SnOlFarmInfoEntity> implements SnOlFarmInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnOlFarmInfoEntity> page = this.selectPage(
                new Query<SnOlFarmInfoEntity>(params).getPage(),
                new EntityWrapper<SnOlFarmInfoEntity>()
        );

        return new PageUtils(page);
    }

}
