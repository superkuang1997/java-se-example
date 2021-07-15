package collection.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author by yorua
 * @classname ArrayList_toArray
 * @description TODO
 * @date 2021/2/19 21:02
 */
public class ArrayList_toArray {

    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] integers = list.toArray(new Integer[list.size()]);
    }

    @Test
    public void test02() {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3});
        list.add(new int[]{2, 3});
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.toArray(new int[list.size()][]));

        for (int[] ints : list) {
            System.out.println(ints);

        }

    }
}
