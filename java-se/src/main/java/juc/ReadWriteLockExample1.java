package juc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author by yorua
 * @date 2021/1/22 18:00
 */
public class ReadWriteLockExample1 {
    public static void main(String[] args) throws InterruptedException {
        MyCache cache = new MyCache();
        // 写操作
        for (int i = 0; i < 50; i++) {
            final int temp = i;
            new Thread(() -> {
                cache.put(String.valueOf(temp), temp + "~data");
            }, String.valueOf(i)).start();
            Thread.sleep(50);
        }
        // 读操作
        for (int i = 0; i < 50; i++) {
            final int temp = i;
            new Thread(() -> {
                cache.get(String.valueOf(temp));
            }, String.valueOf(i)).start();
        }
    }

    static class MyCache {
        private final Map<String, Object> map = new HashMap<>();
        private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        public void put(String key, Object value) {
            readWriteLock.writeLock().lock();
            System.out.println("写线程「" + Thread.currentThread().getName() + "」 开始写入数据");
            map.put(key, value);
            System.out.println("写线程「" + Thread.currentThread().getName() + "」 写入数据完成");
            readWriteLock.writeLock().unlock();
        }

        public void get(String key) {
            readWriteLock.readLock().lock();
            System.out.println("读线程「" + Thread.currentThread().getName() + "」 开始读取数据");
            System.out.println("读线程「" + Thread.currentThread().getName() + "」 读取数据完成 -> " + map.get(key));
            readWriteLock.readLock().unlock();
        }
    }
}


