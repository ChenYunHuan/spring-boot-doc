package com.itstyle.doc.serializable;

import com.itstyle.doc.serializable.model.User;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestSerilizable {

    public static void main(String[] args) {

        List<User> userList = createUserList();
        System.out.println(userList);

        //序列化到硬盘
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("D:/abc.txt"));
            outputStream.writeObject(userList);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            IOUtils.closeQuietly(outputStream);
        }

        //返回Objec对象
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("D:/abc.txt"));
            List<User> users = (List<User>) objectInputStream.readObject();
            System.out.println(users);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static List<User> createUserList() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            User user = new User();
            user.setAge(i + "");
            user.setName("chen" + i);
            users.add(user);
        }
        return users;
    }
}
