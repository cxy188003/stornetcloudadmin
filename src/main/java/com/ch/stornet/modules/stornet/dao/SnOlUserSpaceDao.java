package com.ch.stornet.modules.stornet.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ch.stornet.modules.stornet.entity.SnOlUserSpaceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-15 15:57:42
 */
@Mapper
public interface SnOlUserSpaceDao extends BaseMapper<SnOlUserSpaceEntity> {
    SnOlUserSpaceEntity selectByUserId(String userId);
}
