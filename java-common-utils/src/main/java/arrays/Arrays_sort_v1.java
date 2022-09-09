package arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @Description TODO
 * @date 2020/11/9 5:37 下午
 * @author by yorua
 */
public class Arrays_sort_v1 {
    @Test
    public void test01() {
        int[] arr = {5, 2, 7, 4, 0};
        Arrays.sort(arr);
        // 调用了Object的toString方法
        System.out.println(arr.toString());
        // Arrays的toString静态方法，接收数组作为参数
        System.out.println(Arrays.toString(arr));

        Arrays.sort(new int[0]);
    }

    // 匿名内部类的方式
    @Test
    public void test02() {
        Integer[] arr = {5, 2, 7, 4, 0, 25};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}