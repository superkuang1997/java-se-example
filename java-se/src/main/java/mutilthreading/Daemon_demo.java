package mutilthreading;

/**
 * @author by yorua
 * @classname demo_Daemon
 * @description TODO
 * @date 2021/1/13 11:10 上午
 */
public class Daemon_demo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int j = 0; j < 20; j++) {
                System.out.println(Thread.currentThread().getName() + " -> " + j);
            }
        });
        thread.setDaemon(true);
    }
}
