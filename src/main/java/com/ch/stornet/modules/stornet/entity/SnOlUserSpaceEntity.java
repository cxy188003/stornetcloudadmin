package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-15 15:57:42
 */
@TableName("sn_ol_user_space")
public class SnOlUserSpaceEntity implements Serializable {
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
	private Long totalSpace;
	/**
	 * 
	 */
	private Long freeSpace;
	/**
	 * 
	 */
	private Long createTime;

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
	public void setTotalSpace(Long totalSpace) {
		this.totalSpace = totalSpace;
	}
	/**
	 * 获取：空间大小
	 */
	public Long getTotalSpace() {
		return totalSpace;
	}
	/**
	 * 设置：
	 */
	public void setFreeSpace(Long freeSpace) {
		this.freeSpace = freeSpace;
	}
	/**
	 * 获取：
	 */
	public Long getFreeSpace() {
		return freeSpace;
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
}
