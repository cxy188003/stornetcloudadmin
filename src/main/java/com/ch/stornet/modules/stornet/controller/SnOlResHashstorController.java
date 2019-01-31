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

import com.ch.stornet.modules.stornet.entity.SnOlResHashstorEntity;
import com.ch.stornet.modules.stornet.service.SnOlResHashstorService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.R;



/**
 * 公司可供hastStor表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
@RestController
@RequestMapping("stornet/snolreshashstor")
public class SnOlResHashstorController {
    @Autowired
    private SnOlResHashstorService snOlResHashstorService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = snOlResHashstorService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
			SnOlResHashstorEntity snOlResHashstor = snOlResHashstorService.selectById(id);

        return R.ok().put("snOlResHashstor", snOlResHashstor);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SnOlResHashstorEntity snOlResHashstor){
			snOlResHashstorService.insert(snOlResHashstor);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SnOlResHashstorEntity snOlResHashstor){
			snOlResHashstorService.updateById(snOlResHashstor);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
			snOlResHashstorService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
