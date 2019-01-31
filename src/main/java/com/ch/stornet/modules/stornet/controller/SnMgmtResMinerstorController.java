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

import com.ch.stornet.modules.stornet.entity.SnMgmtResMinerstorEntity;
import com.ch.stornet.modules.stornet.service.SnMgmtResMinerstorService;
import com.ch.stornet.common.utils.PageUtils;
import com.ch.stornet.common.utils.R;



/**
 * 公司矿工资源信息表
 *
 * @author 
 * @email 
 * @date 2019-01-25 09:38:11
 */
@RestController
@RequestMapping("stornet/snmgmtresminerstor")
public class SnMgmtResMinerstorController {
    @Autowired
    private SnMgmtResMinerstorService snMgmtResMinerstorService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = snMgmtResMinerstorService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
			SnMgmtResMinerstorEntity snMgmtResMinerstor = snMgmtResMinerstorService.selectById(id);

        return R.ok().put("snMgmtResMinerstor", snMgmtResMinerstor);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SnMgmtResMinerstorEntity snMgmtResMinerstor){
			snMgmtResMinerstorService.insert(snMgmtResMinerstor);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SnMgmtResMinerstorEntity snMgmtResMinerstor){
			snMgmtResMinerstorService.updateById(snMgmtResMinerstor);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
			snMgmtResMinerstorService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
