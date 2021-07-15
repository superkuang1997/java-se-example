package streamflow;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author by yorua
 * @description TODO
 * @date 2021/7/11 11:36
 */
public class demo_trans_array_to_list {
    /**
     * int数组转List<Integer>
     */
    @Test
    public void testInt() {
        int[] nums = new int[]{0, 5, 9, 11, 14, 18, 19, 21, 33, 17, 27};
        IntStream stream = Arrays.stream(nums);
        Stream<Integer> boxed = stream.boxed();
        List<Integer> list = boxed.collect(Collectors.toList());
    }

    @Test
    public void testString() {
        String[] strs = {"aaa", "bbb", "ccc"};
        List<String> list = Arrays.stream(strs).map(v -> v).collect(Collectors.toList());
    }

}
