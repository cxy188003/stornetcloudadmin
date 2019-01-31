package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.modules.stornet.entity.SnMgmtChaFastEntity;

import java.util.Map;

/**
 * StorNetCloud通道SN附属表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
public interface SnMgmtChaFastService extends IService<SnMgmtChaFastEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

