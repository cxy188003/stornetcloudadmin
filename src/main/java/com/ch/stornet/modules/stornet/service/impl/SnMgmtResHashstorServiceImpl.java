package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnMgmtResHashstorDao;
import com.ch.stornet.modules.stornet.entity.SnMgmtResHashstorEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtResHashstorService;


@Service("snMgmtResHashstorService")
public class SnMgmtResHashstorServiceImpl extends ServiceImpl<SnMgmtResHashstorDao, SnMgmtResHashstorEntity> implements SnMgmtResHashstorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnMgmtResHashstorEntity> page = this.selectPage(
                new Query<SnMgmtResHashstorEntity>(params).getPage(),
                new EntityWrapper<SnMgmtResHashstorEntity>()
        );

        return new PageUtils(page);
    }

}
