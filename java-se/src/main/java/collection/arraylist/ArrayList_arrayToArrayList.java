package collection.arraylist;

import java.util.*;

/**
 * @author by yorua
 * @classname ArrayList_arrayToArrayList
 * @description TODO
 * @date 2020/12/27 4:03 下午
 */
public class ArrayList_arrayToArrayList {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 7, 9};
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, array);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
