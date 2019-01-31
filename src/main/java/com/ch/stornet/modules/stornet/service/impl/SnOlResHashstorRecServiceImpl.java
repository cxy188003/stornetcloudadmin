package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnOlResHashstorRecDao;
import com.ch.stornet.modules.stornet.entity.SnOlResHashstorRecEntity;
import com.ch.stornet.modules.stornet.service.SnOlResHashstorRecService;


@Service("snOlResHashstorRecService")
public class SnOlResHashstorRecServiceImpl extends ServiceImpl<SnOlResHashstorRecDao, SnOlResHashstorRecEntity> implements SnOlResHashstorRecService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnOlResHashstorRecEntity> page = this.selectPage(
                new Query<SnOlResHashstorRecEntity>(params).getPage(),
                new EntityWrapper<SnOlResHashstorRecEntity>()
        );

        return new PageUtils(page);
    }

}
