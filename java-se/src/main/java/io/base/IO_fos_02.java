package io.base;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Classname IO_fos_02
 * @Description 字节输出流
 * @date 2020/11/11 6:16 下午
 * @author by yorua
 */
public class IO_fos_02 {

    @Test
    public static void test01() throws FileNotFoundException {
        String path = System.getProperty("user.dir");
        // append = true 开启追加模式
        FileOutputStream fos = new FileOutputStream(path + "/src/IO/Files/IO_01.txt", true);
    }
}
