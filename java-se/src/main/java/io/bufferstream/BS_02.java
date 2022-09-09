package io.bufferstream;

import org.junit.Test;

import java.io.*;

/**
 * @Classname BS_02
 * @Description TODO
 * @date 2020/11/13 2:15 下午
 * @author by yorua
 */
public class BS_02 {
    @Test
    public void test01() throws IOException {
        // readline方法
        BufferedReader br = new BufferedReader(new FileReader("src/IO/Files/buffer04.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    @Test
    public void test02() throws IOException {
        // newLine方法
        BufferedReader br = new BufferedReader(new FileReader("src/IO/Files/buffer04.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/IO/Files/buffer05.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
