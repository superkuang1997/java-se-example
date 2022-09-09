package mutilthreading.create_thread;

/**
 * @author by yorua
 * @date 2020/11/10 5:38 下午
 */
public class createThread_03_Runnable {
    public static void main(String[] args) {
        // 创建线程1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                }
            }
        }, "A");
        // 创建线程2
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        }, "B");

        // 开摆
        thread1.start();
        thread2.start();

        // main
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}
