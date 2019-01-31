package com.ch.stornet.modules.stornet.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ch.stornet.modules.stornet.entity.SnOlUserWalletEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-15 15:57:42
 */
@Mapper
public interface SnOlUserWalletDao extends BaseMapper<SnOlUserWalletEntity> {

    int updateByPrimaryKeySelective(SnOlUserWalletEntity record);
    SnOlUserWalletEntity selectByPrimaryKey(String userid);
}
