package io.base;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Classname IO_fos_01
 * @Description 字节输出流
 * @date 2020/11/11 5:07 下午
 * @author by yorua
 */
public class IO_fos_01 {
    @Test
    public void test() {
        System.out.println(System.getProperty("user.dir"));
    }

    @Test
    public void test01() throws IOException {
        String path = System.getProperty("user.dir");
        FileOutputStream fos = new FileOutputStream(path + "/src/IO/Files/IO_01.txt");
        // 写入字符
        fos.write(97);
        fos.write(98);
        fos.write(10000);
        fos.close();
    }


    @Test
    public void test02 () throws IOException {
        String path = System.getProperty("user.dir");
        FileOutputStream fos = new FileOutputStream(path + "/src/IO/Files/IO_02.txt");
        byte[] bytes = {97, 98, 99, 100, 101};
        // 写入byte数组
        fos.write(bytes);
        fos.close();
    }

    @Test
    public void test03() throws IOException {
        String path = System.getProperty("user.dir");
        FileOutputStream fos = new FileOutputStream(path + "/src/IO/Files/IO_02.txt");
        byte[] bytes = {97, 98, 99, 100, 101};
        // 写入byte数组的一部分
        fos.write(bytes, 1, 4);
        fos.close();
    }

    @Test
    public void test04() throws IOException {
        byte[] bytes = "字节".getBytes("utf-8");
        String path = System.getProperty("user.dir");
        FileOutputStream fos = new FileOutputStream(path + "/src/IO/Files/IO_03.txt");
        System.out.println(bytes);
        System.out.println(bytes.length);  // 单位是byte
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);
    }


}
