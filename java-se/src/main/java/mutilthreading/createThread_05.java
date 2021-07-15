package mutilthreading;

/**
 * @Classname MT_04
 * @Description 匿名内部类方式重写Runnable的run方法 更简洁的写法
 * @Date 2020/11/10 5:38 下午
 * @Created by admin
 */
public class createThread_05 {
    public static void main(String[] args) {
        // Thread-0
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                }
            }
        }).start();

        // main
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}
