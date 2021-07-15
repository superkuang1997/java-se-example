package mutilthreading.线程间交互;

import java.util.concurrent.TimeUnit;

/**
 * @author by yorua
 * @classname Example1
 * @description 利用CAS实现顺序打印线程
 * @date 2021/4/12 11:20
 */
public class Example3 {


    public static void main(String[] args) {
        Foo3 foo = new Foo3();
        new Thread(() -> foo.one()).start();
        new Thread(() -> foo.two()).start();
        new Thread(() -> foo.three()).start();
    }
}

class Foo3 {
    private volatile int flag = 1;

    public void one() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("one3");
        flag = 2;
    }

    public void two() {
        while (flag != 2) {

        }
        System.out.println("two3");
        flag = 3;
    }

    public void three() {
        while (flag != 3) {

        }
        System.out.println("three3");

    }

}
