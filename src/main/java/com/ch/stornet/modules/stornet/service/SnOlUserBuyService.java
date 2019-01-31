package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.R;
import com.ch.stornet.modules.stornet.entity.SnOlUserBuyEntity;

import java.util.Map;

/**
 * 商户额度购买表
 *
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-16 14:04:12
 */
public interface SnOlUserBuyService extends IService<SnOlUserBuyEntity> {

    PageUtils queryPage(Map<String, Object> params);

    R selectByIdList(int  page, int pageSize);
}

