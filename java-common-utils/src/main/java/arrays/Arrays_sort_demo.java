package arrays;

import java.util.Arrays;

/**
 * @author by yorua
 * @classname Arrays_sort_demo
 * @description TODO
 * @date 2021/4/12 10:38
 */
public class Arrays_sort_demo {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 6, 2, 1};
        Arrays.sort(nums, 2, 4);
        System.out.println(Arrays.toString(nums));
    }
}
