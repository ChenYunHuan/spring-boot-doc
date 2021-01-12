package com.itstyle.doc.bingdu;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.itstyle.doc.bingdu.model.Apple;
import com.itstyle.doc.bingdu.model.Store;
import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;

public class FastJsonTest {
    public static void main(String[] args) {
        Store store = new Store();
        store.setName("Hollis");
        Apple apple = new Apple();
        apple.setPrice(new BigDecimal(0.5));
        store.setFruit(apple);
        String jsonString = JSON.toJSONString(store, SerializerFeature.WriteClassName);
        System.out.println("toJSONString : " + jsonString);

        Store newStore = JSON.parseObject(jsonString, Store.class);
        System.out.println("parseObject : " + newStore);
        Apple newApple = (Apple) newStore.getFruit();
        System.out.println("getFruit : " + newApple);
    }


}
