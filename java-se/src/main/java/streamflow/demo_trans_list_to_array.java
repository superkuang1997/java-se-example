package streamflow;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author by yorua
 * @date 2021/7/12 09:33
 */
public class demo_trans_list_to_array {

    @Test
    public void test01() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        IntStream intStream = list.stream().mapToInt(v -> v);
        int[] ints = intStream.toArray();
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void test02() {
        List<String> list = Arrays.asList("aa", "bb", "cc");
        String[] strings = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(strings));
    }
}
