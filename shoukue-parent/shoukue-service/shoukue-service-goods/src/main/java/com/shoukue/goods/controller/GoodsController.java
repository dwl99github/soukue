package com.shoukue.goods.controller;

import com.shoukue.goods.pojo.Goods;
import com.shoukue.goods.service.GoodsService;
import com.shoukue.service.common.aop.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengwenlong
 * 2020/11/15
 */
@RestController
@RequestMapping("/goods")
@ResponseResult
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /***
     * 根据ID查询User数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Goods findById(@PathVariable String id) {
        return goodsService.findById(id);
//        return new Result<User>(true, StatusCode.OK, "查询成功", user);
    }
}
