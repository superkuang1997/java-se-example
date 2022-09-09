package mutilthreading.thread_collaboration;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author by yorua
 * @classname Example1
 * @description 利用CAS实现顺序打印线程
 * @date 2021/4/12 11:20
 */
public class Example1 {


    public static void main(String[] args) {
        Foo1 foo = new Foo1();
        new Thread(() -> foo.one()).start();
        new Thread(() -> foo.two()).start();
        new Thread(() -> foo.three()).start();
    }
}

class Foo1 {
    AtomicInteger lock1 = new AtomicInteger();
    AtomicInteger lock2 = new AtomicInteger();

    public void one() {
        System.out.println("one");
        lock1.incrementAndGet();
    }

    public void two() {
        while (lock1.get() != 1) {

        }
        System.out.println("two");
        lock2.incrementAndGet();
    }

    public void three() {
        while (lock2.get() != 1) {

        }
        System.out.println("three");

    }

}
