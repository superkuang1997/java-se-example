package collection.comparator;

import java.util.*;

public class Comparator_demo3 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 5}, {2, 4}, {1, 3}};
        Arrays.sort(matrix, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        System.out.println(Arrays.deepToString(matrix));
    }
}
