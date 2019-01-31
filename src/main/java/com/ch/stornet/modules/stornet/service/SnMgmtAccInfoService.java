package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.modules.stornet.entity.SnMgmtAccInfoEntity;

import java.util.Map;

/**
 * StorNetCloud总帐号表
 *
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-09 16:30:34
 */
public interface SnMgmtAccInfoService extends IService<SnMgmtAccInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

