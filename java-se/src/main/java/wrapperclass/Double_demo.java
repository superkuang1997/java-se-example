package wrapperclass;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by yorua
 * @date 2021/9/13 21:13
 */
public class Double_demo {
    public static void main(String[] args) {
        Map<Double, Integer> map = new HashMap<>();
        double d = 10 / 3.0;
        float f = 10/3.0f;
        System.out.println(d);
        System.out.println(f);

        map.put(d, map.getOrDefault(d, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        System.out.println("--------");
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
        System.out.println(Math.pow(2, 16));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
