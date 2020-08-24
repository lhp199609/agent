package com.sy.lhp.es.service.impl;

import com.sy.lhp.es.model.Goods;
import com.sy.lhp.es.repository.GoodsRepository;
import com.sy.lhp.es.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private ElasticsearchRestTemplate template;

    @Autowired
    private GoodsRepository repository;

    @Override
    public Goods findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Goods save(Goods goods) {
        Goods save = repository.save(goods);
        return save;
    }
}
