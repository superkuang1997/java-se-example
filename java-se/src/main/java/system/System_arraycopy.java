package system;

import java.util.Arrays;

/**
 * @author by yorua
 * @classname System_arraycopy
 * @description TODO
 * @date 2021/3/13 09:21
 */
public class System_arraycopy {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 0, 0, 0};
        int[] b = new int[]{4, 5, 6};
        System.arraycopy(b, 0, a, 0, 3);
        System.out.println(Arrays.toString(a));
    }
}
