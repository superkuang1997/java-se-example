package mutilthreading.thread_safe_example;

/**
 * 使用「同步方法」解决线程安全问题
 * @author by yorua
 * @date 2020/11/10 6:40 下午
 */
public class threadSafe_03 {
    public static void main(String[] args) {
        Window3 window = new Window3();
        Thread t0 = new Thread(window);
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);

        t0.start();
        t1.start();
        t2.start();
    }

    static class Window3 implements Runnable {
        private int ticket = 10000;

        public synchronized void payTicket() {
            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " -> " + ticket);
                    ticket--;
                }
                else {
                    break;
                }
            }
        }

        @Override
        public void run() {
            payTicket();
        }
    }
}

