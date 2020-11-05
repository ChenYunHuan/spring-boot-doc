package com.itstyle.doc.stream.functionInterface;

@FunctionalInterface
public interface FunctionalDefaultMethods {
    void method();

    default void defaultMethod() {
        System.out.println("this is default method");
    }

    static void staticMethod() {
        System.out.println("this is static method");
    }
}
