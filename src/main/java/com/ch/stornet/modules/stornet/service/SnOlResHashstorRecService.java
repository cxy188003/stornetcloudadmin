package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.modules.stornet.entity.SnOlResHashstorRecEntity;

import java.util.Map;

/**
 * hashStor分配表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
public interface SnOlResHashstorRecService extends IService<SnOlResHashstorRecEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

