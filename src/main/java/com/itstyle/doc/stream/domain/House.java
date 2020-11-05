package com.itstyle.doc.stream.domain;

import java.util.function.Supplier;

public class House {
    public static House create(final Supplier<House> houseSupplier) {
        return houseSupplier.get();
    }

    public String sleep(String name) {
        System.out.println(name + "is sleeping");
        return "";
    }
}
