package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *  迭代器遍历ArrayList
 */

public class ArrayList_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list.iterator());
        System.out.println(list.iterator().getClass());

        // 使用容器类的iterator方法获得迭代器  终止条件是iter.hasNext == false
        for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
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
}
