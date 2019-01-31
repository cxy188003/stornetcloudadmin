package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-15 15:57:42
 */
@TableName("sn_ol_user_wallet")
public class SnOlUserWalletEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String userid;
	/**
	 * 金额
	 */
	private Long amount;
	/**
	 * 
	 */
	private String address;
	/**
	 * 币种
	 */
	private String curType;

	/**
	 * 设置：编号
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * 获取：编号
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * 设置：金额
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	/**
	 * 获取：金额
	 */
	public Long getAmount() {
		return amount;
	}
	/**
	 * 设置：
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：币种
	 */
	public void setCurType(String curType) {
		this.curType = curType;
	}
	/**
	 * 获取：币种
	 */
	public String getCurType() {
		return curType;
	}
}
