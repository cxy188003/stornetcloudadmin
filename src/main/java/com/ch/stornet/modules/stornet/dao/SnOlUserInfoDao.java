package com.ch.stornet.modules.stornet.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.ch.stornet.modules.stornet.entity.SnOlUserInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
@Mapper
public interface SnOlUserInfoDao extends BaseMapper<SnOlUserInfoEntity> {

}
