package collection.hashset;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author by yorua
 * @classname HashSet_add
 * @description TODO
 * @date 2021/4/11 09:46
 */
public class HashSet_add {
    @Test
    public void test1() {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l2.add(1);
        l2.add(2);
        System.out.println(set.add(l1));
        System.out.println(set.add(l2));

    }

    @Test
    public void test2() {
    }
}
