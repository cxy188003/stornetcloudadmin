package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnMgmtChaIpfsDao;
import com.ch.stornet.modules.stornet.entity.SnMgmtChaIpfsEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtChaIpfsService;


@Service("snMgmtChaIpfsService")
public class SnMgmtChaIpfsServiceImpl extends ServiceImpl<SnMgmtChaIpfsDao, SnMgmtChaIpfsEntity> implements SnMgmtChaIpfsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnMgmtChaIpfsEntity> page = this.selectPage(
                new Query<SnMgmtChaIpfsEntity>(params).getPage(),
                new EntityWrapper<SnMgmtChaIpfsEntity>()
        );

        return new PageUtils(page);
    }

}
