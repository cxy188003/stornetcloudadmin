package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 公司矿工资源信息表
 * 
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
@TableName("sn_mgmt_res_minerstor")
public class SnMgmtResMinerstorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Integer id;
	/**
	 * ip地址
	 */
	private String ip;
	/**
	 * 端口号
	 */
	private String port;
	/**
	 * 秘钥、密码
	 */
	private String passWord;
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
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：ip地址
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：ip地址
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：端口号
	 */
	public void setPort(String port) {
		this.port = port;
	}
	/**
	 * 获取：端口号
	 */
	public String getPort() {
		return port;
	}
	/**
	 * 设置：秘钥、密码
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**
	 * 获取：秘钥、密码
	 */
	public String getPassWord() {
		return passWord;
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
