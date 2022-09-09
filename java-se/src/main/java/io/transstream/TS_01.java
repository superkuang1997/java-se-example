package io.transstream;

import org.junit.Test;

import java.io.*;

/**
 * @Classname TS_01
 * @Description TODO
 * @date 2020/11/13 2:28 下午
 * @author by yorua
 */
public class TS_01 {
    @Test
    public void test01() throws Exception {
        FileInputStream fis = new FileInputStream("src/IO/Files/ts01.txt");
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = isr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        isr.close();
    }

    @Test
    public void test02() throws Exception {
        FileOutputStream fos = new FileOutputStream("src/IO/Files/ts02.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "unicode");
        osw.write("年轻人不讲武德耗子尾汁");
        osw.close();
    }
}
