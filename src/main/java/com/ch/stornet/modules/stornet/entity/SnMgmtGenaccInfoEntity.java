package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * StorNetCloud总帐号表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-15 15:57:42
 */
@TableName("sn_mgmt_genacc_info")
public class SnMgmtGenaccInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String id;
	/**
	 * 币种
	 */
	private String curType;
	/**
	 * SNC总金额
	 */
	private Long sncTotalAmount;
	/**
	 * 
	 */
	private String sncHeadlessAddress;

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
	/**
	 * 设置：SNC总金额
	 */
	public void setSncTotalAmount(Long sncTotalAmount) {
		this.sncTotalAmount = sncTotalAmount;
	}
	/**
	 * 获取：SNC总金额
	 */
	public Long getSncTotalAmount() {
		return sncTotalAmount;
	}
	/**
	 * 设置：
	 */
	public void setSncHeadlessAddress(String sncHeadlessAddress) {
		this.sncHeadlessAddress = sncHeadlessAddress;
	}
	/**
	 * 获取：
	 */
	public String getSncHeadlessAddress() {
		return sncHeadlessAddress;
	}
}
