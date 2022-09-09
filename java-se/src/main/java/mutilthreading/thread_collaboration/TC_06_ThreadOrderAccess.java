package mutilthreading.thread_collaboration;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author by yorua
 * @classname TC_06
 * @description 三个线程顺序执行
 * @date 2021/1/18 4:46 下午
 */
public class TC_06_ThreadOrderAccess {
    public static void main(String[] args) {
        ShareResource sr = new ShareResource();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sr.print5();
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sr.print10();
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sr.print15();
            }
        }, "C").start();

    }
}

class ShareResource {
    private int flag = 1;
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    public void print5() {
        lock.lock();
        try {
            while (flag != 1) {
                condition1.await();
            }
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            flag = 2;
            condition2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void print10() {
        lock.lock();
        try {
            while (flag != 2) {
                condition2.await();
            }
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);

            }
            flag = 3;
            condition3.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print15() {
        lock.lock();
        try {
            while (flag != 3) {
                condition3.await();
            }
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            flag = 1;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


