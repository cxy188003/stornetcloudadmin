package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 矿工信息表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-17 15:28:16
 */
@TableName("sn_ol_miner_info")
public class SnOlMinerInfoEntity implements Serializable {
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
	 * 删除标记
	 */
	private String delFlag;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 
	 */
	private String field;
	/**
	 * 
	 */
	private String field1;

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
	 * 0:未删除；1：已删除；
	 * @return
	 */
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
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
	/**
	 * 设置：
	 */
	public void setField(String field) {
		this.field = field;
	}
	/**
	 * 获取：
	 */
	public String getField() {
		return field;
	}
	/**
	 * 设置：
	 */
	public void setField1(String field1) {
		this.field1 = field1;
	}
	/**
	 * 获取：
	 */
	public String getField1() {
		return field1;
	}
}
