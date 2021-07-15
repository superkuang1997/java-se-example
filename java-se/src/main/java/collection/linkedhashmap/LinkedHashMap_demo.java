package collection.linkedhashmap;

import org.junit.Test;

import java.util.LinkedHashMap;

/**
 * @author by yorua
 * @classname LinkedHashMap
 * @description TODO
 * @date 2021/3/14 15:53
 */
public class LinkedHashMap_demo {
    @Test
    public void test01() {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1,51);
        map.put(6,12);
        map.put(2,16);
        map.put(4,1);
        System.out.println(map);
    }
}
