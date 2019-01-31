package com.ch.stornet.modules.stornet.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ch.stornet.modules.stornet.entity.SnOlResMinerstorRecEntity;
import com.ch.stornet.modules.stornet.service.SnOlResMinerstorRecService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.R;



/**
 * minerStor分配表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
@RestController
@RequestMapping("stornet/snolresminerstorrec")
public class SnOlResMinerstorRecController {
    @Autowired
    private SnOlResMinerstorRecService snOlResMinerstorRecService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = snOlResMinerstorRecService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
			SnOlResMinerstorRecEntity snOlResMinerstorRec = snOlResMinerstorRecService.selectById(id);

        return R.ok().put("snOlResMinerstorRec", snOlResMinerstorRec);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SnOlResMinerstorRecEntity snOlResMinerstorRec){
			snOlResMinerstorRecService.insert(snOlResMinerstorRec);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SnOlResMinerstorRecEntity snOlResMinerstorRec){
			snOlResMinerstorRecService.updateById(snOlResMinerstorRec);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
			snOlResMinerstorRecService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
