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

import com.ch.stornet.modules.stornet.entity.SnMgmtAccRecEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtAccRecService;




/**
 * StorNetCloud总帐流水表
 *
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-09 16:30:34
 */
@Api(value = "账户流水",description = "账户流水")
@RestController
@RequestMapping("stornet/snmgmtaccrec")
public class SnMgmtAccRecController {
    @Autowired
    private SnMgmtAccRecService snMgmtAccRecService;

    /**
     * 列表
     */
    @Login
    @PostMapping("/list")
    @ApiOperation("流水列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = snMgmtAccRecService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @Login
    @PostMapping("/info/{id}")
    @ApiOperation("流水详细信息")
    public R info(@PathVariable("id") String id){
			SnMgmtAccRecEntity snMgmtAccRec = snMgmtAccRecService.selectById(id);

        return R.ok().put("snMgmtAccRec", snMgmtAccRec);
    }

    /**
     * 保存
     */
    @Login
    @PostMapping("/save")
    @ApiOperation("插入流水")
    public R save(@RequestBody SnMgmtAccRecEntity snMgmtAccRec){
			snMgmtAccRecService.insert(snMgmtAccRec);

        return R.ok();
    }

    /**
     * 修改
     */
    @Login
    @PostMapping("/update")
    @ApiOperation("修改流水")
    public R update(@RequestBody SnMgmtAccRecEntity snMgmtAccRec){
			snMgmtAccRecService.updateById(snMgmtAccRec);

        return R.ok();
    }

    /**
     * 删除
     */
    @Login
    @PostMapping("/delete")
    @ApiOperation("删除流水")
    public R delete(@RequestBody String[] ids){
			snMgmtAccRecService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
