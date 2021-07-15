package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author by yorua
 * @classname Arrays_sort_v3
 * @description TODO
 * @date 2021/3/26 15:52
 */
public class Arrays_sort_v3 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        // 按第一个元素升序  第二个元素降序
        Arrays.sort(nums, ((o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]));
        List<int[]> list = new ArrayList<>();
        for (int[] ints : nums) {
            list.add(ints[1], ints);
        }
        list.toArray(new int[list.size()][]);
    }
}
