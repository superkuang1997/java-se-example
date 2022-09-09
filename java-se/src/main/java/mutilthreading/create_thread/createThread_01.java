package mutilthreading.create_thread;

/**
 * @author by yorua
 * @date 2020/11/10 3:19 下午
 */
public class createThread_01 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        }
    }
}




