package io.properties;

import org.junit.Test;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @Classname Properties_01
 * @Description TODO
 * @date 2020/11/13 11:54 上午
 * @author by yorua
 */
public class Properties_01 {

    @Test
    public void test01() {
        Properties properties = new Properties();
        properties.setProperty("月光", "S");
        properties.setProperty("强袭", "A");
        properties.setProperty("战车", "B");

        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(s + " -> " + properties.getProperty(s));
        }
    }

    @Test
    public void test02() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("月光", "S");
        properties.setProperty("强袭", "A");
        properties.setProperty("战车", "B");
        String path = System.getProperty("user.dir");
        // 字节流不能写入中文字符
        FileOutputStream fis = new FileOutputStream(path + "/src/IO/Files/prop1.properties");
        properties.store(fis, "wlp");
        fis.close();
    }

    @Test
    public void test03() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("月光", "S");
        properties.setProperty("强袭", "A");
        properties.setProperty("战车", "B");
        String path = System.getProperty("user.dir");
        FileWriter fw = new FileWriter(path + "/src/IO/Files/prop3.properties");
        properties.store(fw, "wlp");
        fw.close();
    }

    @Test
    public void test04() throws IOException {
        Properties properties = new Properties();
        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path + "/src/IO/Files/prop1.properties");
        properties.load(fis);
        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(s + " -> " + properties.getProperty(s));
        }
    }

    @Test
    public void test05() throws IOException {
        Properties properties = new Properties();
        String path = System.getProperty("user.dir");
        FileReader fr = new FileReader(path + "/src/IO/Files/prop2.properties");
        properties.load(fr);
        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(s + " -> " + properties.getProperty(s));
        }
    }
}
