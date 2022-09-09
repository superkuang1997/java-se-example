package collection.linkedlist;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname demo_LinkedList_01
 * @Description TODO
 * @date 2020/11/10 11:50 上午
 * @author by yorua
 */
public class LinkedList_demo {

    @Test
    public void test01() {
        List<String> list = new LinkedList<>();
        list.add(0, "a");
        list.add(1, "aa");
        list.add(2, "aaa");
        list.add(1, "aaaa");
        System.out.println(list);
    }

    @Test
    public void test02() {
        LinkedList list = new LinkedList();
        list.addFirst(3);
    }
}
