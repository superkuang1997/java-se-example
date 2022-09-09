package juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author by yorua
 * @date 2021/10/4 16:24
 */
public class ConditionExample {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public static void main(String[] args) {
        ConditionExample example = new ConditionExample();
        Producer producer = example.new Producer();
        Consumer consumer1 = example.new Consumer();
        Consumer consumer2 = example.new Consumer();
        consumer1.start();
        consumer2.start();
        producer.start();

    }


    class Consumer extends Thread {

        @Override
        public void run() {
            consume();
        }

        private void consume() {
            try {
                lock.lock();
                System.out.println("等待一个信号" + currentThread().getName());
                condition.await();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("拿到一个信号" + currentThread().getName());
                lock.unlock();
            }

        }
    }

    class Producer extends Thread {

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            lock.lock();
            System.out.println("发出一个信号" + currentThread().getName());
            condition.signalAll();
            lock.unlock();
        }
    }
}
