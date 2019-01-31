package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * StorNetCloud总帐流水表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-09 16:30:34
 */
@TableName("sn_mgmt_acc_rec")
public class SnMgmtAccRecEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String id;
	/**
	 * 转入地址
	 */
	private String toAddress;
	/**
	 * 转出地址
	 */
	private String fromAddress;
	/**
	 * 转帐金额
	 */
	private Long amount;
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
	 * 设置：转入地址
	 */
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	/**
	 * 获取：转入地址
	 */
	public String getToAddress() {
		return toAddress;
	}
	/**
	 * 设置：转出地址
	 */
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	/**
	 * 获取：转出地址
	 */
	public String getFromAddress() {
		return fromAddress;
	}
	/**
	 * 设置：转帐金额
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	/**
	 * 获取：转帐金额
	 */
	public Long getAmount() {
		return amount;
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
