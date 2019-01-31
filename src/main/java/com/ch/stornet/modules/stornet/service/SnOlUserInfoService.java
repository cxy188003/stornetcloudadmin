package com.ch.stornet.modules.stornet.service;

import com.baomidou.mybatisplus.service.IService;
import com.ch.stornet.common.utils.R;
import com.ch.stornet.modules.stornet.entity.SnOlUserBuyEntity;
import com.ch.stornet.modules.stornet.entity.SnOlUserInfoEntity;

public interface SnOlUserInfoService extends IService<SnOlUserInfoEntity> {

    R recharge(String id,String isExamine,String examinDesc);
    R queryBalance(String userId);

    R queryRenterInfo(String userId);
}
