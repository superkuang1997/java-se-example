package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList的retainAll方法，取交集
 * @author by yorua
 * @date 2021/2/19 21:02
 */

public class ArrayList_retainAll {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("刘备");
        list1.add("关羽");
        list1.add("张飞");
        list2.add("曹操");
        list2.add("典韦");
        list2.add("关羽");
        list1.retainAll(list2);
        System.out.println(list1);

    }
}
