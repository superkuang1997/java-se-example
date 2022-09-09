package io.bufferstream;

import org.junit.Test;

import java.io.*;

/**
 * @Classname BS
 * @Description TODO
 * @date 2020/11/13 1:53 下午
 * @author by yorua
 */
public class BS_01 {
    @Test
    public void test01() throws IOException {
        // 字节缓冲输出流
        FileOutputStream fos = new FileOutputStream("src/IO/Files/buffer01.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("数据写入内部缓冲区".getBytes());
        bos.close();
    }

    @Test
    public void test02() throws IOException {
        // 字节缓冲输入流
        FileInputStream fis = new FileInputStream("src/IO/Files/buffer02.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];
        int len = 0;  // 记录每次读取到的有效字节个数
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        bis.close();
    }


    @Test
    public void test03() throws IOException {
        // 字符缓冲输出流
        FileWriter fw = new FileWriter("src/IO/Files/buffer03.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("朋友们好我是混元形意太极门掌门人马保国");
        bw.close();
    }


    @Test
    public void test04() throws IOException {
        // 字符缓冲输入流
        FileReader fr = new FileReader("src/IO/Files/buffer02.txt");
        BufferedReader br = new BufferedReader(fr);
        char[] chars = new char[1024];
        int len = 0;  // 记录每次读取到的有效字节个数
        while ((len = br.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        br.close();
    }
}
