package com.ch.stornet.modules.stornet.dao;

import com.ch.stornet.modules.stornet.entity.SnOlUserBuyEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ch.stornet.modules.stornet.entity.SnOlUserBuyVoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 商户额度购买表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-16 14:04:12
 */
@Mapper
public interface SnOlUserBuyDao extends BaseMapper<SnOlUserBuyEntity> {

    List<SnOlUserBuyVoEntity> selectByIdList(@Param("page") int page,@Param("pageSize") int pageSize);
    String selectListTotal();

}
