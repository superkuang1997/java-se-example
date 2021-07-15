package mutilthreading.JUC;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author by yorua
 * @classname BlockingQueueExample
 * @description TODO
 * @date 2021/1/22 20:38
 */
public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        // 抛出异常
        blockingQueue.add("a");
        blockingQueue.remove();
        // 不抛出异常
        blockingQueue.offer("b");
        blockingQueue.poll();

        // 阻塞
        blockingQueue.put("c");
        blockingQueue.put("c");
        blockingQueue.put("c");

        blockingQueue.take();
        blockingQueue.take();
        blockingQueue.take();
    }
}
