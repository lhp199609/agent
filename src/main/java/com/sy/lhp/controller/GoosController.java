package com.sy.lhp.controller;

import com.sy.lhp.es.model.Goods;
import com.sy.lhp.es.service.GoodsService;
import com.sy.lhp.model.base.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoosController {

    @Autowired
    private GoodsService service;
    @RequestMapping("/find.do")
    public BaseResult findGoods(){
        Goods goods = new Goods();
        goods.setId(1L);
        goods.setGoodsName("手机");
        goods.setNum(20L);
        goods.setPrice("2000");
        service.save(goods);
        Goods byId = service.findById(1L);
        BaseResult baseResult = new BaseResult();
        baseResult.setData(byId);
        return baseResult;
    }
}
