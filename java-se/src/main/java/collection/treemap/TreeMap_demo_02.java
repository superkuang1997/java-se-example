package collection.treemap;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author by yorua
 * @description TODO
 * @date 2021/7/13 09:03
 */
public class TreeMap_demo_02 {
    @Test
    public void test01() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "a");
        map.put(5, "b");
        map.put(1, "c");
        map.put(2, "d");
        System.out.println(map.firstKey());
        System.out.println(map.firstEntry());
        System.out.println(map.lastKey());
        System.out.println(map.lastEntry());
    }

    @Test
    public void test02() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "a");
        map.put(5, "b");
        map.put(1, "c");
        map.put(2, "d");
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        System.out.println(map);

    }


}
