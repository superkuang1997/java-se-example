package mutilthreading;

/**
 * @Classname MT_ThreadSafe
 * @Description 线程安全问题
 * @Date 2020/11/10 5:46 下午
 * @Created by admin
 */
public class threadSafe_01 {
    public static void main(String[] args) {
        Window1 window = new Window1();
        Thread t0 = new Thread(window);
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);

        t0.start();
        t1.start();
        t2.start();
    }
}

class Window1 implements Runnable {
    private int ticket = 500;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + " -> " + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}