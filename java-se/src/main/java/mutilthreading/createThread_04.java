package mutilthreading;

/**
 * @Classname MT_04
 * @Description 匿名内部类方式重写Runnable的run方法
 * @Date 2020/11/10 5:38 下午
 * @Created by admin
 */
public class createThread_04 {
    public static void main(String[] args) {
        // Thread-0
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                }
            }
        }, "A");
        thread.start();

        // main
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}
