package mutilthreading.deadlock;

/**
 * @author by yorua
 * @description TODO
 * @date 2021/7/17 19:25
 */
public class DeadLockDemo {
    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {

        new DeadLockDemo().deadLock();
    }

    private void deadLock() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    System.out.println("t1执行...A");
                    try {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t1执行...B 之前");
                    synchronized (B) {
                        System.out.println("1");
                    }

                }

            }

        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    System.out.println("t2执行...B");
                    synchronized (A) {
                        System.out.println("t2执行...A");
                    }

                }
            }

        });
        t1.start();
        t2.start();
    }
}
