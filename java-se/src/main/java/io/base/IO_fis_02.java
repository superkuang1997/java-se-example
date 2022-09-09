package io.base;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Classname IO_fis_02
 * @Description 字节输入流读取中文字符
 * @date 2020/11/11 5:49 下午
 * @author by yorua
 */
public class IO_fis_02 {
    @Test
    public void test01() throws IOException {
        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path + "/src/IO/Files/IO_03.txt");
        // 一次读两个字节，则无法正确读取中文字符
        byte[] bytes = new byte[2];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            // 仅输出本次读取个数的字节数
            System.out.println(new String(bytes, 0, len));
        }
    }

    @Test
    public void test02() throws IOException {
        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path + "/src/IO/Files/IO_03.txt");
        // 一次读三个字节，可以正确读取中文字符
        byte[] bytes = new byte[3];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            // 仅输出本次读取个数的字节数
            System.out.println(new String(bytes, 0, len));
        }
    }
}
