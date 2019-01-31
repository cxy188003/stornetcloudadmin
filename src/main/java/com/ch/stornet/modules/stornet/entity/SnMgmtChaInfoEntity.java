package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * StorNetCloud通道信息表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-09 16:30:34
 */
@TableName("sn_mgmt_cha_info")
public class SnMgmtChaInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String id;
	/**
	 * 通道类别 0：stornet 1: Ipfs 2: fastDFS 
	 */
	private String type;
	/**
	 * StroNet Daemon IP
	 */
	private String ip;
	/**
	 * Stornet Daemon Port
	 */
	private String port;
	/**
	 * 说明
	 */
	private String remark;

	/**
	 * 设置：编号
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：编号
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：通道类别 0：stornet 1: Ipfs 2: fastDFS 
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：通道类别 0：stornet 1: Ipfs 2: fastDFS 
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：StroNet Daemon IP
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：StroNet Daemon IP
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：Stornet Daemon Port
	 */
	public void setPort(String port) {
		this.port = port;
	}
	/**
	 * 获取：Stornet Daemon Port
	 */
	public String getPort() {
		return port;
	}
	/**
	 * 设置：说明
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：说明
	 */
	public String getRemark() {
		return remark;
	}
}
