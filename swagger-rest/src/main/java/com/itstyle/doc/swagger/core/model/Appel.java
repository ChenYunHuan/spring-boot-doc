package com.itstyle.doc.swagger.core.model;

import java.util.Objects;

public class Appel extends Fruit {

    private String colour;

    private String size;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appel appel = (Appel) o;
        return Objects.equals(colour, appel.colour) &&
                Objects.equals(size, appel.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, size);
    }
}
