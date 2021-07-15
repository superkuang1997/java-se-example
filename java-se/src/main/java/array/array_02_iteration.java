package array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class array_02_iteration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        // 普通for循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 增强for循环
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
