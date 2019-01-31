package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnOlUserSpaceRecDao;
import com.ch.stornet.modules.stornet.entity.SnOlUserSpaceRecEntity;
import com.ch.stornet.modules.stornet.service.SnOlUserSpaceRecService;


@Service("snOlUserSpaceRecService")
public class SnOlUserSpaceRecServiceImpl extends ServiceImpl<SnOlUserSpaceRecDao, SnOlUserSpaceRecEntity> implements SnOlUserSpaceRecService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnOlUserSpaceRecEntity> page = this.selectPage(
                new Query<SnOlUserSpaceRecEntity>(params).getPage(),
                new EntityWrapper<SnOlUserSpaceRecEntity>()
        );

        return new PageUtils(page);
    }

}
