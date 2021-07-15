package streamflow;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author by yorua
 * @description TODO
 * @date 2021/7/12 09:33
 */
public class demo_trans_list_to_array {
    @Test
    public void test() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int[] nums = list.stream().mapToInt(v -> v).toArray();
        System.out.println(Arrays.toString(nums));

    }
}
