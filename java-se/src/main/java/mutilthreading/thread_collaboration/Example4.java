package mutilthreading.thread_collaboration;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author by yorua
 * @classname Example4
 * @description TODO
 * @date 2021/4/12 11:48
 */
public class Example4 {
    public static void main(String[] args) {
        Foo4 foo = new Foo4();
        new Thread(() -> foo.one()).start();
        new Thread(() -> foo.two()).start();
        new Thread(() -> foo.three()).start();
    }
}

class Foo4 {
    Semaphore s1 = new Semaphore(1);
    Semaphore s2 = new Semaphore(0);
    Semaphore s3 = new Semaphore(0);

    public void one() {

        try {
            while (true) {
                s1.acquire();
                System.out.println("one4");
                TimeUnit.SECONDS.sleep(1);
                s2.release();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void two() {
        try {
            while (true) {
                s2.acquire();
                System.out.println("two4");
                TimeUnit.SECONDS.sleep(1);
                s3.release();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void three() {

        try {
            while (true) {
                s3.acquire();
                System.out.println("three4");
                TimeUnit.SECONDS.sleep(1);
                s1.release();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}