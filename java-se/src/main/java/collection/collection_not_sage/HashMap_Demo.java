package collection.collection_not_sage;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by yorua
 * @date 2021/9/8 14:39
 */
public class HashMap_Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    map.put(j, Thread.currentThread().getName() + " "+j);
                    System.out.println(map);
                }
            }).start();

        }
    }
}
