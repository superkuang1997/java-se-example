package mutilthreading;

/**
 * @Classname MT_03
 * @Description Runnable创建线程
 * @Date 2020/11/10 5:35 下午
 * @Created by admin
 */
public class createThread_03_Runnable {
    public static void main(String[] args) {
        TestRunnable runnable = new TestRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }
}

class TestRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }
}
