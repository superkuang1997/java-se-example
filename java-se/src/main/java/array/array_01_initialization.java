package array;

import org.junit.Test;

/**
 * @Classname demo
 * @Description TODO
 * @Date 2020/11/9 3:11 下午
 * @Created by admin
 */
public class array_01_initialization {

    @Test
    public void test01() {
        // 动态初始化
        int[] arr = new int[5];
        arr[0] = 1;
        arr[2] = 2;
        arr[4] = 3;
        for (int i : arr) {
            System.out.println(i);
        }
    }

    @Test
    public void test02() {
        // 静态初始化
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
    }



}
