package com.ch.stornet.modules.stornet.controller;

import java.util.Arrays;
import java.util.Map;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.R;
import com.ch.stornet.modules.stornet.annotation.Login;
import com.ch.stornet.modules.stornet.entity.SnOlUserBuyEntity;
import com.ch.stornet.modules.stornet.service.SnOlUserBuyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ch.stornet.modules.sys.controller.AbstractController.getParam;


/**
 * 商户额度购买表
 *
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-16 14:04:12
 */
@Api(value = "充值申请表",description = "充值申请表")
@RestController
@RequestMapping("stornet/snoluserbuy")
public class SnOlUserBuyController {
    @Autowired
    private SnOlUserBuyService snOlUserBuyService;

    /**
     * 列表
     */
    @PostMapping("/list")
    @ApiOperation("充值列表")
    public R list(@RequestBody Map<String, Object> params ){
        String page = getParam("page",params);
        String pageSize = getParam("pageSize",params);
        return snOlUserBuyService.selectByIdList(Integer.parseInt(page) ,Integer.parseInt(pageSize));
    }
    @Login
    @PostMapping("/list1")
    @ApiOperation("充值列表")
    public R list1(@RequestParam Map<String, Object> params ){

        return R.ok("success");
    }



    /**
     * 信息
     */
    @PostMapping("/info/{id}")
    @ApiOperation("充值详细信息")
    public R info(@PathVariable("id") String id){
			SnOlUserBuyEntity snOlUserBuy = snOlUserBuyService.selectById(id);

        return R.ok().put("snOlUserBuy", snOlUserBuy);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation("插入充值记录")
    public R save(@RequestBody SnOlUserBuyEntity snOlUserBuy){
			snOlUserBuyService.insert(snOlUserBuy);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("充值记录修改")
    public R update(@RequestBody SnOlUserBuyEntity snOlUserBuy){
			snOlUserBuyService.updateById(snOlUserBuy);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("充值记录删除")
    public R delete(@RequestBody String[] ids){
			snOlUserBuyService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
