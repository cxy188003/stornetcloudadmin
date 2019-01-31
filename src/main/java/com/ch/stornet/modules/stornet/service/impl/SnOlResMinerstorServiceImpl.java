package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnOlResMinerstorDao;
import com.ch.stornet.modules.stornet.entity.SnOlResMinerstorEntity;
import com.ch.stornet.modules.stornet.service.SnOlResMinerstorService;


@Service("snOlResMinerstorService")
public class SnOlResMinerstorServiceImpl extends ServiceImpl<SnOlResMinerstorDao, SnOlResMinerstorEntity> implements SnOlResMinerstorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnOlResMinerstorEntity> page = this.selectPage(
                new Query<SnOlResMinerstorEntity>(params).getPage(),
                new EntityWrapper<SnOlResMinerstorEntity>()
        );

        return new PageUtils(page);
    }

}
