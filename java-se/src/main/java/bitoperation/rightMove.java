package bitoperation;

import org.junit.Test;

/**
 * @author by yorua
 * @classname rightMove
 * @description TODO
 * @date 2021/4/26 10:27
 */
public class rightMove {
    @Test
    public void test0() {
        int i = 100;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i >> 2));

    }
    @Test
    public void test1() {
        int i = -100;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i >> 2));
    }
}
