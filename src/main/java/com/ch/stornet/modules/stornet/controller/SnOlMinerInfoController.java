package com.ch.stornet.modules.stornet.controller;

import java.util.Arrays;
import java.util.Map;

import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ch.stornet.modules.stornet.entity.SnOlMinerInfoEntity;
import com.ch.stornet.modules.stornet.service.SnOlMinerInfoService;




/**
 * 矿工信息表
 *
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-17 15:28:16
 */
@Api(value = "矿工信息",description = "矿工信息")
@RestController
@RequestMapping("stornet/snolminerinfo")
public class SnOlMinerInfoController {
    @Autowired
    private SnOlMinerInfoService snOlMinerInfoService;

    /**
     * 列表
     */
    @PostMapping("/list")
    @ApiOperation("矿工列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = snOlMinerInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @PostMapping("/info/{id}")
    @ApiOperation("矿工信息")
    public R info(@PathVariable("id") Integer id){
			SnOlMinerInfoEntity snOlMinerInfo = snOlMinerInfoService.selectById(id);

        return R.ok().put("snOlMinerInfo", snOlMinerInfo);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation("插入矿工信息")
    public R save(@RequestBody SnOlMinerInfoEntity snOlMinerInfo){
			snOlMinerInfoService.insert(snOlMinerInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("更新矿工信息")
    public R update(@RequestBody SnOlMinerInfoEntity snOlMinerInfo){
			snOlMinerInfoService.updateById(snOlMinerInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除矿工")
    public R delete(@RequestBody Integer[] ids){
			snOlMinerInfoService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }



}
