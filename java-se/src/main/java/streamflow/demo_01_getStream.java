package streamflow;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 将集合转换成stream流
 */
public class demo_01_getStream {

    /**
     * 通过 java.util.Collection.stream() 方法用集合创建流
     */
    @Test
    public void test01() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        // 创建一个顺序流
        Stream<Integer> stream = list.stream();
        // 创建一个并行流
        Stream<Integer> parallelStream = list.parallelStream();
        IntStream intStream = stream.mapToInt(x -> x);
        int[] ints = intStream.toArray();
    }

    /**
     * 使用java.util.Arrays.stream(T[] array)方法用数组创建流
     */
    @Test
    public void test02() {
        int[] nums = {1, 3, 5, 6, 8};
        IntStream stream1 = Arrays.stream(nums);

        String[] strings = {"aa", "bb", "cc"};
        Stream<String> stream2 = Arrays.stream(strings);
    }

    /**
     * 3、使用Stream的静态方法：of()、iterate()、generate()
     */
    @Test
    public void test03() {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);

        Stream<Integer> stream2 = Stream.iterate(10, x -> x + 3).limit(3);
        stream2.forEach(System.out::println);

        Stream<Double> stream3 = Stream.generate(Math::random).limit(3);
        stream3.forEach(System.out::println);
    }

    @Test
    public void test04() {
        // 4. 将数组转为Stream流
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> stream1 = Stream.of(arr);
        Stream<Integer> stream2 = Arrays.stream(arr);
    }
}
