package collection.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器遍历ArrayList
 * @author by yorua
 * @date 2021/2/19 21:02
 */

public class ArrayList_Iterator {

    @Test
    public void test01() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list.iterator());
        System.out.println(list.iterator().getClass());

        // 使用容器类的iterator方法获得迭代器  终止条件是iter.hasNext == false
        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            String temp = iter.next();
            System.out.println(temp);
            if (temp.equals("b")) {
                iter.remove();
            }
        }
        System.out.println("---------");
        for (String str : list) {
            System.out.println(str);
        }
    }

    @Test
    public void test02() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("索引" + i + "值" + list.get(i));
            if (list.get(i).equals("a")) list.remove(i);
        }
        System.out.println("---------");
    }
}
