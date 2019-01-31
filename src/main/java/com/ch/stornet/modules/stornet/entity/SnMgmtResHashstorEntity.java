package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 公司hastStor资源信息表
 * 
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
@TableName("sn_mgmt_res_hashstor")
public class SnMgmtResHashstorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private String id;
	/**
	 * 设备型号
	 */
	private String devType;
	/**
	 * 设备编号
	 */
	private String devNo;
	/**
	 * 删除标记0：未删除，1：删除
	 */
	private String delFlag;
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 设置：id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：设备型号
	 */
	public void setDevType(String devType) {
		this.devType = devType;
	}
	/**
	 * 获取：设备型号
	 */
	public String getDevType() {
		return devType;
	}
	/**
	 * 设置：设备编号
	 */
	public void setDevNo(String devNo) {
		this.devNo = devNo;
	}
	/**
	 * 获取：设备编号
	 */
	public String getDevNo() {
		return devNo;
	}
	/**
	 * 设置：删除标记0：未删除，1：删除
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	/**
	 * 获取：删除标记0：未删除，1：删除
	 */
	public String getDelFlag() {
		return delFlag;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
}
