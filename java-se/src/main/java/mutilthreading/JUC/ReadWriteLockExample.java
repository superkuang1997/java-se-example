package mutilthreading.JUC;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author by yorua
 * @classname ReadWriteLockExample
 * @description TODO
 * @date 2021/1/22 18:00
 */
public class ReadWriteLockExample {
    public static void main(String[] args) {
        MyCache cache = new MyCache();
        // 写操作
        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(() -> {
                cache.put(String.valueOf(temp), temp);
            }, String.valueOf(i)).start();
        }
        // 读操作
        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(() -> {
                cache.get(String.valueOf(temp));
            }, String.valueOf(i)).start();
        }
    }
}

class MyCache {
    private volatile Map<String, Object> map = new HashMap<>();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void put(String key, Object value) {
        readWriteLock.writeLock().lock();
        System.out.println(Thread.currentThread().getName() + "\t开始写入数据");
        System.out.println(Thread.currentThread().getName() + "\t写入数据完成");
        readWriteLock.writeLock().unlock();
    }

    public void get(String key) {
        readWriteLock.readLock().lock();
        System.out.println(Thread.currentThread().getName() + "\t开始读取数据");
        System.out.println(Thread.currentThread().getName() + "\t读取数据完成");
        readWriteLock.writeLock().lock();

    }


}
