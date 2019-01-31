package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.modules.stornet.entity.SnMgmtResMinerstorEntity;

import java.util.Map;

/**
 * 公司矿工资源信息表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
public interface SnMgmtResMinerstorService extends IService<SnMgmtResMinerstorEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

