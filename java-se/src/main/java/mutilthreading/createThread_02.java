package mutilthreading;

/**
 * @Classname MT_01
 * @Description TODO
 * @Date 2020/11/10 3:19 下午
 * @Created by admin
 */
public class createThread_02 {
    public static void main(String[] args) {

        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}


