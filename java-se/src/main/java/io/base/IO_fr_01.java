package io.base;


import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Classname IO_fr_01
 * @Description TODO
 * @date 2020/11/12 6:13 下午
 * @author by yorua
 */
public class IO_fr_01 {
    @Test
    public void test01() throws IOException {
        String path = System.getProperty("user.dir");
        FileReader fr = new FileReader(path + "/src/IO/Files/IO_03.txt");
        int len = 0;
        // fr.read() 返回读取到的字符
        while ((len = fr.read()) != -1) {
            System.out.print(len + " ");
            System.out.println((char)len);
        }
    }

    @Test
    public void test02() throws IOException {
        String path = System.getProperty("user.dir");
        FileReader fr = new FileReader(path + "/src/IO/Files/IO_03.txt");
        char[] chars = new char[3];
        int len = 0;
        // fr.read(chars) 返回读取到的字符个数，读取到的数据保存在chars中
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
    }
}
