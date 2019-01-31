package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.modules.stornet.entity.SnOlMinerInfoEntity;

import java.util.Map;

/**
 * 矿工信息表
 *
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-17 15:28:16
 */
public interface SnOlMinerInfoService extends IService<SnOlMinerInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

