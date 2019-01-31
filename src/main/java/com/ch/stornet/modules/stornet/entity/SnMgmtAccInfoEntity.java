package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * StorNetCloud总帐号表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-09 16:30:34
 */
@TableName("sn_mgmt_acc_info")
public class SnMgmtAccInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String id;
	/**
	 * 总帐地址钱包
	 */
	private String sncWalletid;
	/**
	 * SNC总金额
	 */
	private Long sncTotalAmount;
	/**
	 * 钱包收款的地址
	 */
	private String sncRevaddress;

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
	 * 设置：总帐地址钱包
	 */
	public void setSncWalletid(String sncWalletid) {
		this.sncWalletid = sncWalletid;
	}
	/**
	 * 获取：总帐地址钱包
	 */
	public String getSncWalletid() {
		return sncWalletid;
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
	 * 设置：钱包收款的地址
	 */
	public void setSncRevaddress(String sncRevaddress) {
		this.sncRevaddress = sncRevaddress;
	}
	/**
	 * 获取：钱包收款的地址
	 */
	public String getSncRevaddress() {
		return sncRevaddress;
	}
}
