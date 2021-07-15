package io.Base;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Classname IO_fis_01
 * @Description TODO
 * @Date 2020/11/11 5:49 下午
 * @Created by admin
 */
public class IO_fis_01 {
    @Test
    public void test01() throws IOException {
        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path + "/src/IO/Files/IO_02.txt");
        int len = 0;
        // 从输入流读取数据的下一个字节，返回读取到的字节
        while ((len = fis.read()) != -1) {
            System.out.println((char) len);
        }
    }

    @Test
    public void test02() throws IOException {
        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path + "/src/IO/Files/IO_02.txt");
        byte[] bytes = new byte[3];
        // 输入流中读取一些字节数，并将它们存储到字节数组
        // 返回每次读取的字节个数
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
    }

    @Test
    public void test03() throws IOException {
        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path + "/src/IO/Files/IO_02.txt");
        byte[] bytes = new byte[3];
        int len = 0;
        // len为每次读取的有效字节数，数据被读到bytes中
        while ((len = fis.read(bytes)) != -1) {
            // 输出bytes中的所有字节
            System.out.println(new String(bytes));
        }
    }

    @Test
    public void test04() throws IOException {
        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path + "/src/IO/Files/IO_02.txt");
        byte[] bytes = new byte[3];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            // 仅输出本次读取个数的字节数
            System.out.println(new String(bytes, 0, len));
        }
    }
}
