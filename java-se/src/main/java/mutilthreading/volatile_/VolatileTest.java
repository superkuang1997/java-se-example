package mutilthreading.volatile_;

/**
 * @author by yorua
 * @classname VolatileTest
 * @description TODO
 * @date 2021/1/24 11:47
 */
public class VolatileTest {
    public static volatile int race = 0;
    public static void increase() {
        race++;
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[20];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    increase();
                }
            });
            threads[i].start();
        }

        System.out.println(race);
    }
}
