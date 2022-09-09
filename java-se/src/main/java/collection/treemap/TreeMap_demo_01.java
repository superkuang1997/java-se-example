package collection.treemap;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author by yorua
 * @description TODO
 * @date 2021/7/13 09:03
 */
public class TreeMap_demo_01 {
    @Test
    public void test01() {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "a");
        map.put(5, "b");
        map.put(1, "c");
        map.put(2, "d");
        System.out.println(map);
        System.out.println(map.size());
    }

    @Test
    public void test02() {
        Map<String, String> map = new TreeMap<>();
        map.put("f", "a");
        map.put("r", "b");
        map.put("a", "c");
        map.put("c", "d");
        System.out.println(map);
    }
}
