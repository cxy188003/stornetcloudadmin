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

import com.ch.stornet.modules.stornet.entity.SnMgmtChaInfoEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtChaInfoService;



/**
 * StorNetCloud通道信息表
 *
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-09 16:30:34
 */
@Api(value = "通道信息",description = "通道信息")
@RestController
@RequestMapping("stornet/snmgmtchainfo")
public class SnMgmtChaInfoController {
    @Autowired
    private SnMgmtChaInfoService snMgmtChaInfoService;

    /**
     * 列表
     */
    @PostMapping("/list")
    @ApiOperation("通道列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = snMgmtChaInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @PostMapping("/info/{id}")
    @ApiOperation("通道详细信息")
    public R info(@PathVariable("id") String id){
			SnMgmtChaInfoEntity snMgmtChaInfo = snMgmtChaInfoService.selectById(id);

        return R.ok().put("snMgmtChaInfo", snMgmtChaInfo);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation("插入通道")
    public R save(@RequestBody SnMgmtChaInfoEntity snMgmtChaInfo){
			snMgmtChaInfoService.insert(snMgmtChaInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("更新通道信息")
    public R update(@RequestBody SnMgmtChaInfoEntity snMgmtChaInfo){
			snMgmtChaInfoService.updateById(snMgmtChaInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除通道")
    public R delete(@RequestBody String[] ids){
			snMgmtChaInfoService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
