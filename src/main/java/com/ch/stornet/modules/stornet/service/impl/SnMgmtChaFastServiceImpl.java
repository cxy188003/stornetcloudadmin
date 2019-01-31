package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnMgmtChaFastDao;
import com.ch.stornet.modules.stornet.entity.SnMgmtChaFastEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtChaFastService;


@Service("snMgmtChaFastService")
public class SnMgmtChaFastServiceImpl extends ServiceImpl<SnMgmtChaFastDao, SnMgmtChaFastEntity> implements SnMgmtChaFastService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnMgmtChaFastEntity> page = this.selectPage(
                new Query<SnMgmtChaFastEntity>(params).getPage(),
                new EntityWrapper<SnMgmtChaFastEntity>()
        );

        return new PageUtils(page);
    }

}
