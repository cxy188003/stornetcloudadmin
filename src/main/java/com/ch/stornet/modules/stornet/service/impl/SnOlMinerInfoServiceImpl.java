package com.ch.stornet.modules.stornet.service.impl;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.ch.stornet.modules.stornet.dao.SnOlMinerInfoDao;
import com.ch.stornet.modules.stornet.entity.SnOlMinerInfoEntity;
import com.ch.stornet.modules.stornet.service.SnOlMinerInfoService;


@Service("snOlMinerInfoService")
public class SnOlMinerInfoServiceImpl extends ServiceImpl<SnOlMinerInfoDao, SnOlMinerInfoEntity> implements SnOlMinerInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnOlMinerInfoEntity> page = this.selectPage(
                new Query<SnOlMinerInfoEntity>(params).getPage(),
                new EntityWrapper<SnOlMinerInfoEntity>()
        );

        return new PageUtils(page);
    }

}
