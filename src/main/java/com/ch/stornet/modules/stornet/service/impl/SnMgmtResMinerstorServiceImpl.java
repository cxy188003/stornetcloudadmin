package com.ch.stornet.modules.stornet.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;

import com.ch.stornet.modules.stornet.dao.SnMgmtResMinerstorDao;
import com.ch.stornet.modules.stornet.entity.SnMgmtResMinerstorEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtResMinerstorService;


@Service("snMgmtResMinerstorService")
public class SnMgmtResMinerstorServiceImpl extends ServiceImpl<SnMgmtResMinerstorDao, SnMgmtResMinerstorEntity> implements SnMgmtResMinerstorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnMgmtResMinerstorEntity> page = this.selectPage(
                new Query<SnMgmtResMinerstorEntity>(params).getPage(),
                new EntityWrapper<SnMgmtResMinerstorEntity>()
        );

        return new PageUtils(page);
    }

}
