package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.modules.stornet.entity.SnOlResMinerstorEntity;

import java.util.Map;

/**
 * 公司可供矿工表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
public interface SnOlResMinerstorService extends IService<SnOlResMinerstorEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

