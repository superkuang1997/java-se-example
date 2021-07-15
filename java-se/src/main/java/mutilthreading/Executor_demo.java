package mutilthreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author by yorua
 * @classname Executor_01
 * @description TODO
 * @date 2021/1/13 11:06 上午
 */
public class Executor_demo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 20; j++) {
                    System.out.println(Thread.currentThread().getName() + " -> " + j);
                }
            });
        }
        executorService.shutdown();
    }
}

