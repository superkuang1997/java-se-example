package mutilthreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname MT_ThreadSafe_04
 * @Description 通过「ReentrantLock锁对象」解决线程安全问题
 * @Date 2020/11/10 7:29 下午
 * @Created by admin
 */
public class threadSafe_04 {
    public static void main(String[] args) {
        Window4 window = new Window4();
        Thread t0 = new Thread(window);
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        t0.start();
        t1.start();
        t2.start();
    }

}

class Window4 implements Runnable {
    private int ticket = 10000;
    // 可重入锁
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            // 加锁
            lock.lock();
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + " -> " + ticket);
                ticket--;
            } else {
                break;
            }
            // 解锁
            lock.unlock();
        }
    }
}
