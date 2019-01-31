package com.ch.stornet.modules.stornet.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 商户额度购买表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-16 14:04:12
 */
@TableName("sn_ol_user_buy")
public class SnOlUserBuyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String id;
	/**
	 * 用户编号
	 */
	private String userId;
	/**
	 * 购买数量
	 */
	private BigDecimal purchaseCount;
	/**
	 * 付款凭证
	 */
	private String payVoucher;
	/**
	 * 是否审核（1:审核中，2:审核通过，3：审核不通过）
	 */
	private String isExamine;
	/**
	 * 审核描述
	 */
	private String examinDesc;
	/**
	 * 审核时间
	 */
	private Long examinTime;
	/**
	 * 创建者
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	private Long createTime;
	/**
	 * 更新者
	 */
	private String updateBy;
	/**
	 * 更新时间
	 */
	private Long updateTime;
	/**
	 * 备注信息
	 */
	private String remarks;
	/**
	 * 删除标记
	 */
	private String delFlag;

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
	 * 设置：用户编号
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户编号
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：购买数量
	 */
	public void setPurchaseCount(BigDecimal purchaseCount) {
		this.purchaseCount = purchaseCount;
	}
	/**
	 * 获取：购买数量
	 */
	public BigDecimal getPurchaseCount() {
		return purchaseCount;
	}
	/**
	 * 设置：付款凭证
	 */
	public void setPayVoucher(String payVoucher) {
		this.payVoucher = payVoucher;
	}
	/**
	 * 获取：付款凭证
	 */
	public String getPayVoucher() {
		return payVoucher;
	}
	/**
	 * 设置：是否审核（1:审核中，2:审核通过，3：审核不通过）
	 */
	public void setIsExamine(String isExamine) {
		this.isExamine = isExamine;
	}
	/**
	 * 获取：是否审核（1:审核中，2:审核通过，3：审核不通过）
	 */
	public String getIsExamine() {
		return isExamine;
	}
	/**
	 * 设置：审核描述
	 */
	public void setExaminDesc(String examinDesc) {
		this.examinDesc = examinDesc;
	}
	/**
	 * 获取：审核描述
	 */
	public String getExaminDesc() {
		return examinDesc;
	}
	/**
	 * 设置：审核时间
	 */
	public void setExaminTime(Long examinTime) {
		this.examinTime = examinTime;
	}
	/**
	 * 获取：审核时间
	 */
	public Long getExaminTime() {
		return examinTime;
	}
	/**
	 * 设置：创建者
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**
	 * 获取：创建者
	 */
	public String getCreateBy() {
		return createBy;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Long getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新者
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * 获取：更新者
	 */
	public String getUpdateBy() {
		return updateBy;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Long getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：备注信息
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注信息
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 设置：删除标记
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	/**
	 * 获取：删除标记
	 */
	public String getDelFlag() {
		return delFlag;
	}
}
