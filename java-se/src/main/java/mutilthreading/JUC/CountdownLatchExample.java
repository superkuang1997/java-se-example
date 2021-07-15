package mutilthreading.JUC;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author by yorua
 * @classname CountdownLatchExample
 * @description TODO
 * @date 2021/1/18 10:34 上午
 */

public class CountdownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 6;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "\trun..");
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() + "\tend");
        executorService.shutdown();
    }
}
