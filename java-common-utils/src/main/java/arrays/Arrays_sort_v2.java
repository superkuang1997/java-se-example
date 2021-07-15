package arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author by yorua
 * @classname Arrays_sort_2
 * @description TODO
 * @date 2021/3/14 16:45
 */
public class Arrays_sort_v2 {
    public static void main(String[] args) {
        int[] n3 = new int[]{3, 6};
        int[] n1 = new int[]{1, 3};
        int[] n2 = new int[]{2, 4};
        int[][] nums = new int[][]{n3, n2, n1};
        Arrays.sort(nums, Comparator.comparing(x -> x[0]));
        for (int[] num : nums) {
            System.out.println(Arrays.toString(num));
        }
    }
}
