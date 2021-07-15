package collection.comparator;

import java.util.*;

public class Comparator_demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("python");
        list.add("java");
        list.add("golang");
        list.add("c++");
        list.add("ruby");


        // sort方法的第二个参数中传入Comparator的匿名内部类，重写compare方法
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (Iterator iter = list.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
