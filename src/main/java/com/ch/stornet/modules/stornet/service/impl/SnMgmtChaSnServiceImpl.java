package com.ch.stornet.modules.stornet.service.impl;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.ch.stornet.modules.stornet.dao.SnMgmtChaSnDao;
import com.ch.stornet.modules.stornet.entity.SnMgmtChaSnEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtChaSnService;


@Service("snMgmtChaSnService")
public class SnMgmtChaSnServiceImpl extends ServiceImpl<SnMgmtChaSnDao, SnMgmtChaSnEntity> implements SnMgmtChaSnService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnMgmtChaSnEntity> page = this.selectPage(
                new Query<SnMgmtChaSnEntity>(params).getPage(),
                new EntityWrapper<SnMgmtChaSnEntity>()
        );

        return new PageUtils(page);
    }

}
