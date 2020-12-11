package com.itstyle.doc.core;

import com.itstyle.doc.swagger.core.factory.ModelFactory;
import com.itstyle.doc.swagger.core.model.Fruit;

import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class TestFactory {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties pro = ModelFactory.getPro();
        Fruit instance = ModelFactory.getInstance("apple");
        System.out.println(instance);

        Fruit instance1 = ModelFactory.getInstance("orange");
        System.out.println(instance1);

        Driver aClass =(Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
        System.out.println(aClass);
    }
}
