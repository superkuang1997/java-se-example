package streamflow;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author by yorua
 * @description sort
 * @date 2021/7/13 22:38
 */
public class demo_08_sorted {
    @Test
    public void test() {
        int[] nums = new int[]{4, 56, 12, 78, 32, 50};
        int[] ints = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(ints));
    }
}
