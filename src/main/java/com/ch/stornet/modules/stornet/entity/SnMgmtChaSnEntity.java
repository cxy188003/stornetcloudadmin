package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * StorNetCloud通道SN附属表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-09 16:30:34
 */
@TableName("sn_mgmt_cha_sn")
public class SnMgmtChaSnEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String id;
	/**
	 * 助记词
	 */
	private String password;
	/**
	 * 节点当前金额
	 */
	private Long currAmount;
	/**
	 * 收款地址
	 */
	private String recvAddress;
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
	 * 设置：助记词
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：助记词
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：节点当前金额
	 */
	public void setCurrAmount(Long currAmount) {
		this.currAmount = currAmount;
	}
	/**
	 * 获取：节点当前金额
	 */
	public Long getCurrAmount() {
		return currAmount;
	}
	/**
	 * 设置：收款地址
	 */
	public void setRecvAddress(String recvAddress) {
		this.recvAddress = recvAddress;
	}
	/**
	 * 获取：收款地址
	 */
	public String getRecvAddress() {
		return recvAddress;
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
