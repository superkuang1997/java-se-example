package bitoperation;

import org.junit.Test;

/**
 * @author by yorua
 * @classname rrightMove
 * @description TODO
 * @date 2021/4/26 10:36
 */
public class rrightMove {
    @Test
    public void test0() {
        int i = 100;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i >>> 2));

    }

    @Test
    public void test1() {
        int i = -100;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i >>> 1));
        System.out.println(i);
        System.out.println(i>>>1);
    }
}
