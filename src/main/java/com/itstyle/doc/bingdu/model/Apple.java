package com.itstyle.doc.bingdu.model;

import com.itstyle.doc.swagger.core.model.Fruit;

import java.math.BigDecimal;

public class Apple extends Fruit {

    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
