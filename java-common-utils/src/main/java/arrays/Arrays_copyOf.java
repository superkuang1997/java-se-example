package arrays;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author by yorua
 * @description TODO
 * @date 2021/7/10 16:33
 */
public class Arrays_copyOf {

    @Test
    public void test() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(Arrays.copyOf(nums, nums.length)));
    }

}
