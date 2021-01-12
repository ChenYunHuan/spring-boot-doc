package com.itstyle.doc.bingdu.model;

import com.itstyle.doc.swagger.core.model.Fruit;

public class Store {

    private String name;

    private Fruit fruit;

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
