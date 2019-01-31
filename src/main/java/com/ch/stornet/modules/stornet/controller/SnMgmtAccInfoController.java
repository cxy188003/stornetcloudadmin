package com.ch.stornet.modules.stornet.controller;

import java.util.Arrays;
import java.util.Map;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.R;
import com.ch.stornet.modules.stornet.annotation.Login;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ch.stornet.modules.stornet.entity.SnMgmtAccInfoEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtAccInfoService;




/**
 * StorNetCloud总帐号表
 *
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-09 16:30:34
 */
@Api(value = "公司账户",description = "公司账户")
@RestController
@RequestMapping("stornet/snmgmtaccinfo")
public class SnMgmtAccInfoController {
    @Autowired
    private SnMgmtAccInfoService snMgmtAccInfoService;

    /**
     * 列表
     */
    @Login
    @PostMapping("/list")
    @ApiOperation("账户列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = snMgmtAccInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @Login
    @PostMapping("/info/{id}")
    @ApiOperation("账户详细信息")
    public R info(@PathVariable("id") String id){
			SnMgmtAccInfoEntity snMgmtAccInfo = snMgmtAccInfoService.selectById(id);

        return R.ok().put("snMgmtAccInfo", snMgmtAccInfo);
    }

    /**
     * 保存
     */
    @Login
    @PostMapping("/save")
    @ApiOperation("新建账户")
    public R save(@RequestBody SnMgmtAccInfoEntity snMgmtAccInfo){
			snMgmtAccInfoService.insert(snMgmtAccInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @Login
    @PostMapping("/update")
    @ApiOperation("修改账户")
    public R update(@RequestBody SnMgmtAccInfoEntity snMgmtAccInfo){
			snMgmtAccInfoService.updateById(snMgmtAccInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @Login
    @PostMapping("/delete")
    @ApiOperation("删除账户")
    public R delete(@RequestBody String[] ids){
			snMgmtAccInfoService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
