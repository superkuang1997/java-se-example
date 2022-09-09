package socket.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author by yorua
 * @date 2021/8/16 11:13
 */
public class BlockNioServer {

    public static void main(String[] args) throws IOException {

        // 1.获取通道
        ServerSocketChannel server = ServerSocketChannel.open();

        // 2.得到文件通道，将客户端传递过来的图片写到本地项目下(写模式、没有则创建)
        FileChannel outChannel = FileChannel.open(Paths.get("/Users/yorua/Pictures/emoji/copy.gif"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        // 3. 绑定链接
        server.bind(new InetSocketAddress(6666));

        // 4. 获取客户端的连接(阻塞的)
        SocketChannel client = server.accept();

        // 5. 要使用NIO，有了Channel，就必然要有Buffer，Buffer是与数据打交道的
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // 6.将客户端传递过来的图片保存在本地中
        int i = 0;
        while (client.read(buffer) != -1) {
            System.out.println(i++);
            // 在读之前都要切换成读模式
            buffer.flip();
            outChannel.write(buffer);
            // 读完切换成写模式，能让管道继续读取文件的数据
            buffer.clear();
        }
        System.out.println("服务端读完了");
        buffer.put("img is success".getBytes());
        buffer.flip();
        client.write(buffer);
        buffer.clear();

        // 7.关闭通道
        outChannel.close();
        client.close();
        server.close();
    }
}
