package com.ch.stornet.modules.stornet.service.impl;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.Query;
import com.ch.stornet.common.utils.R;
import com.ch.stornet.modules.stornet.entity.SnOlUserBuyVoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;


import com.ch.stornet.modules.stornet.dao.SnOlUserBuyDao;
import com.ch.stornet.modules.stornet.entity.SnOlUserBuyEntity;
import com.ch.stornet.modules.stornet.service.SnOlUserBuyService;


@Service("snOlUserBuyService")
public class SnOlUserBuyServiceImpl extends ServiceImpl<SnOlUserBuyDao, SnOlUserBuyEntity> implements SnOlUserBuyService {

    @Autowired
    private SnOlUserBuyDao snOlUserBuyDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SnOlUserBuyEntity> page = this.selectPage(
                new Query<SnOlUserBuyEntity>(params).getPage(),
                new EntityWrapper<SnOlUserBuyEntity>()
        );

        return new PageUtils(page);
    }

    public R selectByIdList(int  page, int pageSize)
    {
        if (page<=0){page=1;}
        if(pageSize<=0){pageSize=10;}
        page = page < 1 ? 0 : (page - 1) * pageSize;
        List<SnOlUserBuyVoEntity> page1 =  snOlUserBuyDao.selectByIdList(page,pageSize);
        String total = snOlUserBuyDao.selectListTotal();
        String pageCount = String.valueOf(Integer.parseInt(total)/pageSize+1);
        Map<String,Object> data =new HashMap<>();
        data.put("list",page1);
        data.put("total",Integer.parseInt(total));
        data.put("pageCount",Integer.parseInt(pageCount));
        data.put("page",page+1);
        data.put("pageSize",pageSize);
        return R.ok().put("map",data);
    }

}
