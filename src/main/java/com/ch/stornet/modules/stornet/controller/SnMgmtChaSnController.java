package com.ch.stornet.modules.stornet.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ch.stornet.modules.stornet.entity.SnMgmtChaSnEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtChaSnService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.R;



/**
 * StorNetCloud通道SN附属表
 *
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-09 16:30:34
 */
@Api(value = "通道附属信息",description = "通道附属信息")
@RestController
@RequestMapping("stornet/snmgmtchasn")
public class SnMgmtChaSnController {
    @Autowired
    private SnMgmtChaSnService snMgmtChaSnService;

    /**
     * 列表
     */
    @PostMapping("/list")
    @ApiOperation("通道附属列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = snMgmtChaSnService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @PostMapping("/info/{id}")
    @ApiOperation("通道附属列表详细信息")
    public R info(@PathVariable("id") String id){
			SnMgmtChaSnEntity snMgmtChaSn = snMgmtChaSnService.selectById(id);

        return R.ok().put("snMgmtChaSn", snMgmtChaSn);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation("插入通道附属信息")
    public R save(@RequestBody SnMgmtChaSnEntity snMgmtChaSn){
			snMgmtChaSnService.insert(snMgmtChaSn);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("更新通道附属信息")
    public R update(@RequestBody SnMgmtChaSnEntity snMgmtChaSn){
			snMgmtChaSnService.updateById(snMgmtChaSn);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除通道附属信息记录")
    public R delete(@RequestBody String[] ids){
			snMgmtChaSnService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
