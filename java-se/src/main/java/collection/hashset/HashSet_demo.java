package collection.hashset;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_demo {
    @Test
    public void test01() {
        Set set = new HashSet<>();
        set.add("block");
        set.add("thread");
        set.add("process");

        System.out.println(set);
        System.out.println(set.iterator());
        System.out.println(set.iterator().getClass());

        System.out.println("-------------");

        for (Iterator iter = set.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }

    @Test
    public void test02() {
        Set<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(Integer.toHexString(l1.hashCode()));
        System.out.println(Integer.toHexString(l2.hashCode()));

        l1.remove(1);
        System.out.println(Integer.toHexString(l1.hashCode()));
        System.out.println(Integer.toHexString(l2.hashCode()));
        System.out.println(set.add(l1));;
        System.out.println(set.add(l2));;
    }
}
