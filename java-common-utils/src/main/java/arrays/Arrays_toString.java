package arrays;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author by yorua
 * @date 2021/8/8 16:45
 */
public class Arrays_toString {
    @Test
    public void test() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix));
    }
}
