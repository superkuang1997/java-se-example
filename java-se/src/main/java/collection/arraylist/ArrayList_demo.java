package collection.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author by yorua
 * @description TODO
 * @date 2020/12/27 3:46 下午
 */
public class ArrayList_demo {
    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    @Test
    public void test02() {
        List<String> list = new ArrayList<>();
        list.add("刘备");
        list.add("关羽");
        list.add("张飞");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("----------");
        list.remove("张飞");

        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void test03() {
        List<String> list = new ArrayList<>();
        list.add("python");
        list.add("java");
        list.add("golang");
        list.add("c++");
        list.add("ruby");
        list.remove("c++");
        Collections.shuffle(list);
        // forEach遍历
        for(String string: list) {
            System.out.println(string);
        }
    }

    @Test
    public void test04() {
        List<String> list = new ArrayList<>();
        System.out.println(list.get(0));  // error

    }

}
