package com.ch.stornet.modules.sys.controller;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ch.stornet.modules.sys.entity.SysUserEntity;

import java.util.Map;

/**
 * Controller公共组件
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年11月9日 下午9:42:26
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		return (SysUserEntity) SecurityUtils.getSubject().getPrincipal();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}

	public static String getParam(String paramName, Map<String, Object> params) {
		String param = null;
		Object o = params.get(paramName);
		if (o != null) {
			param = o.toString();
		}
		return param;
	}
}
