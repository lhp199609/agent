package com.sy.lhp.es.service;

import com.sy.lhp.es.model.Goods;

public interface GoodsService {

    Goods findById(Long id);

    Goods save(Goods goods);
}
