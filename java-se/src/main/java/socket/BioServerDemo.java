package socket;

/**
 * @author by yorua
 * @classname BioServerDemo
 * @description TODO
 * @date 2021/4/28 15:08
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 这是一个单线程BIOServer
 *
 * @author endless
 * @create 2020-03-23
 */

public class BioServerDemo {

    public static void main(String[] args) throws IOException {
        // 创建ServerSocket，并绑定端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务启动成功");
        while (true) {
            Socket socket = serverSocket.accept();

            System.out.println("连接成功!");
            System.out.println(socket.getLocalAddress());
            System.out.println(socket.getLocalSocketAddress());
            System.out.println("准备接收数据");
            byte[] bytes = new byte[1024];
            socket.getInputStream().read(bytes);
            System.out.println("接收到了数据：" + new String(bytes));
        }
    }

}

