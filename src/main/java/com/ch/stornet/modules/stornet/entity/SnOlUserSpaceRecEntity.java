package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
@TableName("sn_ol_user_space_rec")
public class SnOlUserSpaceRecEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 文件上传者
	 */
	private String userid;
	/**
	 * 租期
	 */
	private String duration;
	/**
	 * 空间大小
	 */
	private Long space;
	/**
	 * 
	 */
	private Integer type;
	/**
	 * 
	 */
	private Long createTime;
	/**
	 * 
	 */
	private Long dueTime;

	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：文件上传者
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * 获取：文件上传者
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * 设置：租期
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}
	/**
	 * 获取：租期
	 */
	public String getDuration() {
		return duration;
	}
	/**
	 * 设置：空间大小
	 */
	public void setSpace(Long space) {
		this.space = space;
	}
	/**
	 * 获取：空间大小
	 */
	public Long getSpace() {
		return space;
	}
	/**
	 * 设置：
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Long getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setDueTime(Long dueTime) {
		this.dueTime = dueTime;
	}
	/**
	 * 获取：
	 */
	public Long getDueTime() {
		return dueTime;
	}
}
