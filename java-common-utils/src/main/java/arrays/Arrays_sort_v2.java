package arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author by yorua
 * @date 2021/3/14 16:45
 */
public class Arrays_sort_v2 {
    @Test
    public void test01() {
        int[] n1 = new int[]{1, 3};
        int[] n2 = new int[]{2, 4};
        int[] n3 = new int[]{3, 6};
        int[][] nums = new int[][]{n3, n2, n1};
        Arrays.sort(nums, Comparator.comparing(x -> x[0]));
        for (int[] num : nums) {
            System.out.println(Arrays.toString(num));
        }

    }

    @Test
    public void test02() {
        int[] nums = new int[]{3, 30, 34, 5, 9};
        String[] strings = Arrays.stream(nums).boxed().map(String::valueOf).toArray(String[]::new);
        Arrays.sort(strings, (v1, v2) -> (v1 + v2).compareTo(v2 + v1));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(nums));
    }
}
