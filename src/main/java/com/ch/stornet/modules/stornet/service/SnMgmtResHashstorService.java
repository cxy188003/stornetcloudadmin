package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.modules.stornet.entity.SnMgmtResHashstorEntity;

import java.util.Map;

/**
 * 公司hastStor资源信息表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
public interface SnMgmtResHashstorService extends IService<SnMgmtResHashstorEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

