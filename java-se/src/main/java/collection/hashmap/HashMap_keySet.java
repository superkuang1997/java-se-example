package collection.hashmap;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_keySet {
    Map<String, Integer> map;

    @Before
    public void before() {
        map = new HashMap<>();
        map.put("诸葛亮", 100);
        map.put("司马懿", 98);
        map.put("周瑜", 97);
    }

    @Test
    public void test01() {
        // HashMap的keySet方法，获得键的集合
        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        System.out.println(keys);
        System.out.println(values);

        // 增强for循环遍历keys
        for (String key : map.keySet()) {
            System.out.println(key + " --- " + map.get(key));
        }
    }

    @Test
    public void test02() {
        Set<String> keys = map.keySet();
        System.out.println(keys);
    }
}
