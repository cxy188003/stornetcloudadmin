package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnOlFarmDetailDao;
import com.ch.stornet.modules.stornet.entity.SnOlFarmDetailEntity;
import com.ch.stornet.modules.stornet.service.SnOlFarmDetailService;


@Service("snOlFarmDetailService")
public class SnOlFarmDetailServiceImpl extends ServiceImpl<SnOlFarmDetailDao, SnOlFarmDetailEntity> implements SnOlFarmDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnOlFarmDetailEntity> page = this.selectPage(
                new Query<SnOlFarmDetailEntity>(params).getPage(),
                new EntityWrapper<SnOlFarmDetailEntity>()
        );

        return new PageUtils(page);
    }

}
