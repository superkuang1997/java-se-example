package mutilthreading.thread_safe_example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 通过「ReentrantLock锁对象」解决线程安全问题
 * @author by yorua
 * @date 2020/11/10 7:29 下午
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

    static class Window4 implements Runnable {
        // 可重入锁
        Lock lock = new ReentrantLock();
        private int ticket = 10000;

        @Override
        public void run() {
            while (true) {
                // 加锁
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " -> " + ticket);
                    ticket--;
                }
                else {
                    break;
                }
                // 解锁
                lock.unlock();
            }
        }
    }

}


