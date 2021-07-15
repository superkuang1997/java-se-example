package mutilthreading.ThreadCollaboration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author by yorua
 * @classname WaitNotifyExample
 * @description TODO
 * @date 2021/1/18 10:06 上午
 */
public class TC_01_WaitNotifyExample {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        TC_01_WaitNotifyExample example = new TC_01_WaitNotifyExample();
        es.execute(() -> example.after());
        es.execute(() -> example.before());
    }

    public synchronized void before() {
        System.out.println("before");
        notifyAll();
        System.out.println("唤醒");
    }

    public synchronized void after() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }
}
