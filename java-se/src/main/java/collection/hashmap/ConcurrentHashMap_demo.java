package collection.hashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author by yorua
 * @date 2021/9/11 16:12
 */
public class ConcurrentHashMap_demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        System.out.println(map.get("123"));
        System.out.println(map.containsKey("123"));

    }
}
