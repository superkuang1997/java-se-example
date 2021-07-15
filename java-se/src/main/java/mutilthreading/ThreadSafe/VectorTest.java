package mutilthreading.ThreadSafe;

import java.util.Vector;

/**
 * @author by yorua
 * @classname VectorTest
 * @description TODO
 * @date 2021/1/26 22:06
 */
public class VectorTest {
    private static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {
        while (true) {
            for (int i = 0; i < 10; i++) {
                vector.add(i);
            }
            new Thread(() -> {
                for (int i = 0; i < vector.size(); i++) {
                    vector.remove(i);
                }
            }).start();

            new Thread(() -> {
                for (int i = 0; i < vector.size(); i++) {
                    System.out.println(vector.get(i));
                }
            }).start();

            while (Thread.activeCount() > 10);
        }
    }
}
