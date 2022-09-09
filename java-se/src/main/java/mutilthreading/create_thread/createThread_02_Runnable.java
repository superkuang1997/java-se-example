package mutilthreading.create_thread;

/**
 * @author by yorua
 * @Classname MT_03
 * @Description Runnable创建线程
 * @date 2020/11/10 5:35 下午
 */
public class createThread_02_Runnable {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        
        thread.interrupt();
        thread.isInterrupted();
        Thread.interrupted();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "->" + i);
            }
        }
    }
}


