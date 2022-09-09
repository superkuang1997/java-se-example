package mutilthreading.thread_safe_example;

/**
 * 使用同步代码块synchronized解决线程安全问题
 * @author by yorua
 * @date 2020/11/10 6:35 下午
 */

public class threadSafe_02 {
    public static void main(String[] args) {
        Window2 window = new Window2();
        Thread t0 = new Thread(window);
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);

        t0.start();
        t1.start();
        t2.start();
    }

    static class Window2 implements Runnable {
        final Object lock = new Object();
        private int ticket = 10000;

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + " -> " + ticket);
                        ticket--;
                    }
                    else {
                        break;
                    }
                }
            }
        }
    }
}

