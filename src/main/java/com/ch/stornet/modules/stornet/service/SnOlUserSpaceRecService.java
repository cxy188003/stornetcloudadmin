package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.modules.stornet.entity.SnOlUserSpaceRecEntity;

import java.util.Map;

/**
 * 
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
public interface SnOlUserSpaceRecService extends IService<SnOlUserSpaceRecEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

