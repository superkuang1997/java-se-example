package io.base;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Classname IO_fw_01
 * @Description TODO
 * @date 2020/11/12 6:25 下午
 * @author by yorua
 */
public class IO_fw_01 {

    @Test
    public void test01() throws IOException {
        String path = System.getProperty("user.dir");
        FileWriter fw = new FileWriter(path + "/src/IO/Files/IO_04.txt");
        fw.write(97);
    }

    @Test
    public void test02() throws IOException {
        String path = System.getProperty("user.dir");
        FileWriter fw = new FileWriter(path + "/src/IO/Files/IO_04.txt");
        for (int i = 0; i < 1024; i++) {
            fw.write(97);
            fw.flush();
        }
        fw.close();
    }

    @Test
    public void test04() throws IOException {
        String path = System.getProperty("user.dir");
        FileWriter fw = new FileWriter(path + "/src/IO/Files/IO_04.txt");
        String string = new String("接化发松果檀抖闪电鞭");
        fw.write(string, 0, 3);
        fw.close();
    }

    @Test
    public void test05() throws IOException {
        String path = System.getProperty("user.dir");
        FileWriter fw = new FileWriter(path + "/src/IO/Files/IO_04.txt", true);
        String string = new String("接化发松果檀抖闪电鞭");
        fw.write(string);
        fw.close();
    }
}
