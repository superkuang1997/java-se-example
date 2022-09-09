package mutilthreading.create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author by yorua
 * @date 2021/1/19 9:53 上午
 */
public class createThread_04_Callable {
    public static void main(String[] args) throws Exception {
        MyCallable callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        new Thread(futureTask, "A").start();
        TimeUnit.SECONDS.sleep(3);
        System.out.println("获取计算结果...");
        System.out.println(futureTask.get());
    }

    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            System.out.println("开始计算.......该线程执行需要花挺长时间");
            TimeUnit.SECONDS.sleep(2);
            return 1024;
        }
    }
}



