package socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author by yorua
 * @classname BioClientDemo
 * @description TODO
 * @date 2021/4/28 15:08
 */
public class BioClientDemo2 {

    public static void main(String[] args) throws IOException {
        // 连接Server
        Socket socket = new Socket("127.0.0.1", 9998);
        System.out.println("连接成功");
        Scanner scanner = new Scanner(System.in);
        // 循环等待输入消息
        while (true) {
            String str = scanner.next();
            // 约定退出口令
            if ("exit".equalsIgnoreCase(str)) {
                socket.close();
                System.exit(0);
            }
            socket.getOutputStream().write(str.getBytes());
            socket.getOutputStream().flush();
        }
    }
}

