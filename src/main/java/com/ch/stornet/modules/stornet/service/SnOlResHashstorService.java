package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.PageUtils;

import com.ch.stornet.modules.stornet.entity.SnOlResHashstorEntity;

import java.util.Map;

/**
 * 公司可供hastStor表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
public interface SnOlResHashstorService extends IService<SnOlResHashstorEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

