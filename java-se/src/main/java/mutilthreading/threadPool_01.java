package mutilthreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Classname MT_POOL_01
 * @Description 线程池
 * @Date 2020/11/11 11:29 上午
 * @Created by admin
 */
public class threadPool_01 {
    public static void main(String[] args) {
        // 线程池会一直开启使用完了线程，会自动把线程归还给线程池，线程可以继续使用
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(new RunnableImplement());
        es.submit(new RunnableImplement());
        es.submit(new RunnableImplement());
        es.submit(new RunnableImplement());
        // 关闭线程池（一般不关闭）
        es.shutdown();
    }
}

class RunnableImplement implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}