package system;

import java.util.Arrays;

public class demo_02 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr1, 1, arr2, 1, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
