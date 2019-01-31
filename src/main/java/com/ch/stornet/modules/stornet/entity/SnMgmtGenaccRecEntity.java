package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * StorNetCloud总帐流水表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-15 15:57:42
 */
@TableName("sn_mgmt_genacc_rec")
public class SnMgmtGenaccRecEntity implements Serializable {
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
	 * 金额
	 */
	private Long amount;
	/**
	 * 用户号
	 */
	private String toAddress;
	/**
	 * 1:充值，2：消费
	 */
	private String trType;
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
	 * 设置：用户号
	 */
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	/**
	 * 获取：用户号
	 */
	public String getToAddress() {
		return toAddress;
	}
	/**
	 * 设置：1:充值，2：消费
	 */
	public void setTrType(String trType) {
		this.trType = trType;
	}
	/**
	 * 获取：1:充值，2：消费
	 */
	public String getTrType() {
		return trType;
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
