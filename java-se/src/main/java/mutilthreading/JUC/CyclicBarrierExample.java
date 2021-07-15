package mutilthreading.JUC;

import java.util.concurrent.CyclicBarrier;

/**
 * @author by yorua
 * @classname CyclicBarrierExample
 * @description TODO
 * @date 2021/1/22 17:29
 */
public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> System.out.println("召唤神龙"));
        for (int i = 1; i <= 7; i++) {
            final int temp = i;
            new Thread(() -> {
                System.out.println("已收集第" + temp + "颗龙珠");
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
    }
}
