package collection.hashmap;

import org.junit.After;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by yorua
 * @classname demo_HashMap
 * @description TODO
 * @date 2021/1/7 12:46 下午
 */
public class HashMap_demo {
    Map<String, Integer> map;

    @After
    public void after() {
        map = new HashMap<>();
        map.put("诸葛亮", 100);
        map.put("司马懿", 98);
        map.put("周瑜", 97);
    }

    @Test
    public void test01() {
        System.out.println(map.get("诸葛亮"));
    }

    @Test
    public void test02() {
        if (map.containsKey("诸葛亮")) {
            System.out.println(map.get("诸葛亮"));
        }
    }

    @Test
    public void test03() {
        map.getOrDefault("诸葛亮", null);
    }

    @Test
    public void test04() {
        map.remove("诸葛亮");
    }

    @Test
    public void test05() {
//        System.out.println(map.containsKey(1));
    }

}


