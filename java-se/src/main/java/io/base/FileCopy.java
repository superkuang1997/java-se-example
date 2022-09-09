package io.base;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Classname FileCopy
 * @Description TODO
 * @date 2020/11/12 5:28 下午
 * @author by yorua
 */
public class FileCopy {
    @Test
    public void test01() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/admin/Pictures/images/WechatIMG2.jpeg");
        FileOutputStream fos = new FileOutputStream("/Users/admin/Pictures/images/WechatIMG3.jpeg");
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        // 释放资源
        fos.close();
        fis.close();
    }

    @Test
    public void test02() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/admin/Pictures/images/WechatIMG2.jpeg");
        FileOutputStream fos = new FileOutputStream("/Users/admin/Pictures/images/WechatIMG4.jpeg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        // 释放资源
        fos.close();
        fis.close();
    }
}
