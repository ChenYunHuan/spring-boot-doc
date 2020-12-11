package com.itstyle.doc.swagger.core.factory;

import com.itstyle.doc.swagger.core.model.Fruit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ModelFactory {

    public static Properties getPro() throws FileNotFoundException, IOException {
        Properties pro = new Properties();
        String filePath = ModelFactory.class.getClassLoader().getResource("className.properties").getFile();
        File f = new File(filePath);
        if (f.exists()) {
            pro.load(new FileInputStream(f));
        }
        else {
            pro.setProperty("apple", "com.itstyle.doc.swagger.core.model.Appel");
        }
        return pro;
    }


    public static Fruit getInstance(String className) throws IOException {
        Properties pro = getPro();
        String property = pro.getProperty(className);
        Fruit f = null;
        try {
            f = (Fruit) Class.forName(property).newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
