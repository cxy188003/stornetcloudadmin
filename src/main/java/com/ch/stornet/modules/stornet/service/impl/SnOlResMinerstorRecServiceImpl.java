package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnOlResMinerstorRecDao;
import com.ch.stornet.modules.stornet.entity.SnOlResMinerstorRecEntity;
import com.ch.stornet.modules.stornet.service.SnOlResMinerstorRecService;


@Service("snOlResMinerstorRecService")
public class SnOlResMinerstorRecServiceImpl extends ServiceImpl<SnOlResMinerstorRecDao, SnOlResMinerstorRecEntity> implements SnOlResMinerstorRecService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnOlResMinerstorRecEntity> page = this.selectPage(
                new Query<SnOlResMinerstorRecEntity>(params).getPage(),
                new EntityWrapper<SnOlResMinerstorRecEntity>()
        );

        return new PageUtils(page);
    }

}
