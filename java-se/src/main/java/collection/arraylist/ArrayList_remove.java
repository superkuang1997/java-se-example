package collection.arraylist;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author by yorua
 * @date 2021/3/13 22:52
 */
public class ArrayList_remove {

    ArrayList<String> list;

    @Before
    public void test() {
        list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
    }

    @Test
    public void test01() {
        // 这种方式不能删除所有满足条件的元素  删除元素后原本后来位置的元素会前移 导致跳过
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i: " + i);
            if (list.get(i).equals("b")) {
                list.remove("b");
            }
        }
        System.out.println(list);
    }

    @Test
    public void test02() {
        // 正确的做法是使用迭代器 way1
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.equals("b")) {
                iter.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    public void test03() {
        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            String s = iter.next();
            if (s.equals("b")) {
                iter.remove();
            }
        }

        System.out.println(list);
    }

    @Test
    public void test04() {
        // 报错
        for (String s : list) {
            if (s.equals("b")) {
                list.remove(s);
            }
        }
        System.out.println(list);
    }

    @Test
    public void test05() {

    }
}
