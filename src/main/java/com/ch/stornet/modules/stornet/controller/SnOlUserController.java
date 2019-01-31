package com.ch.stornet.modules.stornet.controller;

import com.ch.stornet.common.utils.R;

import com.ch.stornet.modules.stornet.annotation.Login;
import com.ch.stornet.modules.stornet.entity.SnOlUserBuyEntity;
import com.ch.stornet.modules.stornet.service.SnOlUserInfoService;
import com.ch.stornet.modules.sys.controller.AbstractController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(value = "用户充值审核",description = "用户充值审核")
@RestController
@RequestMapping("/app/user")
public class SnOlUserController extends AbstractController {
    private static final Logger log = LoggerFactory.getLogger(SnOlUserController.class);

    @Autowired
    private SnOlUserInfoService snOlUserInfoService;
    /**
     * 用户充值
     *
     * @param
     * @return
     */

    @PostMapping("/recharge")
//    @ApiOperation("充值审核")
//    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", name = "params", required = true,
//            value = "id,examinDesc,isExamine:1审核中，2审核通过，3审核不通过,")})
    public R recharge(@RequestBody Map<String, Object> params ) {
//        String id = (String) params.get("id");
//        String isExamine = (String) params.get("isExamine");
//        String examinDesc = (String) params.get("examinDesc");
        String id = getParam("id",params);
        String isExamine = getParam("isExamine",params);
        String examinDesc = getParam("examinDesc",params);
        log.info(id+"-----"+isExamine+"-----"+examinDesc);
        return snOlUserInfoService.recharge(id,isExamine,examinDesc);
    }
    /**
     * 获取用户钱包余额
     * @param params
     * @return
     */
    @PostMapping("/balance")
    @ApiOperation("钱包余额")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", name = "params", required = true,
            value = "userId")})
    public R balance(@RequestBody Map<String, Object> params) {
        String userId = getParam("userId", params);
        return snOlUserInfoService.queryBalance(userId);
    }

    /**
     * 获取用户租用信息
     *
     * @param params
     * @return
     */
    @PostMapping("/renterInfo")
    @ApiOperation("租用信息")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", name = "params", required = true,
            value = "userId")})
    public R renterInfo(@RequestBody Map<String, Object> params) {
        String userId = getParam("userId", params);
        return snOlUserInfoService.queryRenterInfo(userId);
    }
}
