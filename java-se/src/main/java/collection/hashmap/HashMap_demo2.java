package collection.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by yorua
 * @classname HashMap_demo2
 * @description TODO
 * @date 2021/3/11 16:37
 */
public class HashMap_demo2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        System.out.println(map.containsKey(null));
    }
}
