package mutilthreading;

/**
 * @Classname MT_ThreadSafe_02
 * @Description 使用同步代码块synchronized解决线程安全问题
 * @Date 2020/11/10 6:35 下午
 * @Created by admin
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
}

class Window2 implements Runnable {
    private int ticket = 10000;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " -> " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}