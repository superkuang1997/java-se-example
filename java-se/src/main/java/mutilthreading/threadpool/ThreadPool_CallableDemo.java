package mutilthreading.threadpool;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author by yorua
 * @date 2021/8/24 17:57
 */

public class ThreadPool_CallableDemo {

    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());

        List<Future<String>> futureList = new ArrayList<>();
        Callable<String> callable = new MyCallable();
        for (int i = 0; i < 10; i++) {
            // 提交任务到线程池
            Future<String> future = executor.submit(callable);
            // 将返回值 future 添加到 list，我们可以通过 future 获得 执行 Callable 得到的返回值
            System.out.println(future.getClass());
            futureList.add(future);
        }

        System.out.println("获取任务结果");
        for (Future<String> future : futureList) {
            try {
                // future.get() 方法会阻塞
                System.out.println(new Date() + "::" + future.get());
            }
            catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //关闭线程池
        executor.shutdown();
    }

    static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(2000);
            // 返回执行当前 Callable 的线程名字
            return Thread.currentThread().getName();
        }
    }
}
