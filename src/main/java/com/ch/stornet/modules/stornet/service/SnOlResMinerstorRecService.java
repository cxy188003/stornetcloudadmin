package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.modules.stornet.entity.SnOlResMinerstorRecEntity;

import java.util.Map;

/**
 * minerStor分配表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
public interface SnOlResMinerstorRecService extends IService<SnOlResMinerstorRecEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

