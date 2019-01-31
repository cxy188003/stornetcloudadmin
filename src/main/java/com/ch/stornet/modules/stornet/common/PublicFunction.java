package com.ch.stornet.modules.stornet.common;


import com.ch.stornet.common.constants.Constants;
import com.ch.stornet.modules.sys.entity.SysUserEntity;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 公共函数
 *
 * @author yangzebin
 * @date 2018年11月25日 上午9:42:26
 */
public class PublicFunction {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	public static SysUserEntity getSysUser() {
		return (SysUserEntity) SecurityUtils.getSubject().getPrincipal();
	}

	public static Long getSysUserId() {
		return getSysUser().getUserId();
	}

	public static String getRandomHeadlessUrl() {
		int rdm = (int) (1 + Math.random() * 4);
		return "http://" + Constants.HEADLESSLIST[rdm - 1];
	}

}
