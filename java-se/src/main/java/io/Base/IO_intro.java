package io.Base;

import java.io.UnsupportedEncodingException;

/**
 * @Classname IO_01_intro
 * @Description TODO
 * @Date 2020/11/11 4:59 下午
 * @Created by admin
 */
public class IO_intro {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 字符 ---> 字节流
        String msg = "字节&字符";
        byte[] data = msg.getBytes("utf-8");
        System.out.println(data);
        System.out.println(data.length);  // 13

        // 字节流 ---> 字符
        msg = new String(data, 0, data.length, "unicode");
        System.out.println(msg);
    }
}
