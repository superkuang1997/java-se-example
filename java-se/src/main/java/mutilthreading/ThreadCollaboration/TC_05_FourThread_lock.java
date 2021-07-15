package mutilthreading.ThreadCollaboration;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author by yorua
 * @classname FourThreadExample
 * @description 这里使用可重用锁，而不是synchronized
 *              Condition对象的await、signalAll方法
 * @date 2021/1/18 4:12 下午
 */
public class TC_05_FourThread_lock {
    public static  void main(String[] args) {
        CounterD counter = new CounterD();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(200);
                    counter.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(300);
                    counter.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(250);
                    counter.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, "C").start();

        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(400);
                    counter.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, "D").start();

    }
}

class CounterD {
    int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws InterruptedException {
        lock.lock();
        try {
            while (number != 0) {
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public  void decrement() throws InterruptedException {
        lock.lock();
        try {
            while (number == 0) {
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
