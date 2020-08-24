package com.sy.lhp.es.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "goods",type = "goods")
public class Goods {

    @Id
    @Field(type = FieldType.Long)
    private Long id;
    @Field(type = FieldType.Text,analyzer = "ik-smart")
    private String goodsName;
    @Field(type = FieldType.Keyword)
    private String price;
    @Field(type = FieldType.Long)
    private Long num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }
}
