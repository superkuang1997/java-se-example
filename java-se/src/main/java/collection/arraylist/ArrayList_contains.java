package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by yorua
 * @classname demo_ArrayList_contains
 * @description TODO
 * @date 2021/2/19 16:47
 */
public class ArrayList_contains {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("python");
        list.add("java");
        list.add("golang");
        list.add("c++");
        list.add("ruby");
        System.out.println(list.contains("java"));
    }
}
