package mutilthreading.线程间交互;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author by yorua
 * @classname Example1
 * @description 利用CAS实现顺序打印线程
 * @date 2021/4/12 11:20
 */
public class Example2 {


    public static void main(String[] args) {
        Foo2 foo = new Foo2();
        new Thread(() -> foo.one()).start();
        new Thread(() -> foo.two()).start();
        new Thread(() -> foo.three()).start();
    }
}

class Foo2 {
    Semaphore s1 = new Semaphore(0);
    Semaphore s2 = new Semaphore(0);

    public void one() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("one");
        s1.release();  // // s1 信号量加一
    }

    public void two() {
        try {
            s1.acquire();  // s1 信号量减一
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("two");
        s2.release();
    }

    public void three() {
        try {
            s2.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("three");

    }

}
