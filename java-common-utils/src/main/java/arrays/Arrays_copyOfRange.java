package arrays;

import java.util.Arrays;

/**
 * @author by yorua
 * @classname Arrays_copyOfRange
 * @description TODO
 * @date 2021/3/2 19:12
 */
public class Arrays_copyOfRange {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr1_2 = Arrays.copyOfRange(arr1, 1, 1);
        int[] arr2 = Arrays.copyOf(arr1, 2);
        int[] arr3 = Arrays.copyOfRange(arr1, 0, 2);
        int[] arr4 = Arrays.copyOfRange(arr1, 1, arr1.length - 1);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr1_2));
    }
}
