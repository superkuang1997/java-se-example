package io.SerializerStream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Classname SE
 * @Description TODO
 * @Date 2020/11/13 2:52 下午
 * @Created by admin
 */
public class SE {
    @Test
    public void test01() throws Exception {
        FileOutputStream fos = new FileOutputStream("src/IO/Files/se01.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student student = new Student("kiana", 18);
        oos.writeObject(student);
        oos.close();
    }

    @Test
    public void test02() throws Exception {
        FileInputStream fis = new FileInputStream("src/IO/Files/se01.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        System.out.println(student);
    }
}
