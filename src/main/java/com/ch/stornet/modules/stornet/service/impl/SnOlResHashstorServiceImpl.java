package com.ch.stornet.modules.stornet.service.impl;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;


import com.ch.stornet.modules.stornet.dao.SnOlResHashstorDao;
import com.ch.stornet.modules.stornet.entity.SnOlResHashstorEntity;
import com.ch.stornet.modules.stornet.service.SnOlResHashstorService;


@Service("snOlResHashstorService")
public class SnOlResHashstorServiceImpl extends ServiceImpl<SnOlResHashstorDao, SnOlResHashstorEntity> implements SnOlResHashstorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnOlResHashstorEntity> page = this.selectPage(
                new Query<SnOlResHashstorEntity>(params).getPage(),
                new EntityWrapper<SnOlResHashstorEntity>()
        );

        return new PageUtils(page);
    }

}
