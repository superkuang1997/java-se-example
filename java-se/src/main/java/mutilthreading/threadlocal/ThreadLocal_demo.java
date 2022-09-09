package mutilthreading.threadlocal;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author by yorua
 * @classname ThreadLocal_demo
 * @description TODO
 * @date 2021/3/30 09:58
 */
public class ThreadLocal_demo {
    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<>();
        Random random = new Random();
        IntStream.range(0, 5).forEach(x -> new Thread(() -> {
            local.set(x + "  " + random.nextInt(100));
            System.out.println("----->  " + local.get());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start());
    }
}
