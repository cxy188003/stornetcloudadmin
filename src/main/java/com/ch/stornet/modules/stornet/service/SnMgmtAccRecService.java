package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.PageUtils;

import com.ch.stornet.modules.stornet.entity.SnMgmtAccRecEntity;

import java.util.Map;

/**
 * StorNetCloud总帐流水表
 *
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-09 16:30:34
 */
public interface SnMgmtAccRecService extends IService<SnMgmtAccRecEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

