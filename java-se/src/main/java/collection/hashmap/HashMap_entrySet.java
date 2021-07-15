package collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_entrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("诸葛亮", 100);
        map.put("司马懿", 98);
        map.put("周瑜", 97);

        // HashMap的entrySet方法，获得Map.Entry<K, V>对象的Set集合
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        System.out.println(set);
        System.out.println(set.getClass());

        // Map.Entry是Map的一个内部接口
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }

    }
}
