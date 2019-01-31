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

import com.ch.stornet.modules.stornet.entity.SnOlResMinerstorEntity;
import com.ch.stornet.modules.stornet.service.SnOlResMinerstorService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.R;



/**
 * 公司可供矿工表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
@RestController
@RequestMapping("stornet/snolresminerstor")
public class SnOlResMinerstorController {
    @Autowired
    private SnOlResMinerstorService snOlResMinerstorService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = snOlResMinerstorService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
			SnOlResMinerstorEntity snOlResMinerstor = snOlResMinerstorService.selectById(id);

        return R.ok().put("snOlResMinerstor", snOlResMinerstor);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SnOlResMinerstorEntity snOlResMinerstor){
			snOlResMinerstorService.insert(snOlResMinerstor);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SnOlResMinerstorEntity snOlResMinerstor){
			snOlResMinerstorService.updateById(snOlResMinerstor);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
			snOlResMinerstorService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
