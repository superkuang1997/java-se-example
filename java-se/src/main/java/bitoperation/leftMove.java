package bitoperation;

import org.junit.Test;

/**
 * @author by yorua
 * @classname leftMove
 * @description TODO
 * @date 2021/4/26 10:17
 */
public class leftMove {
    @Test
    public void test01() {
        int i = -100;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i << 2));
    }
    @Test
    public void test02() {
        int i = 100;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i << 2));
        System.out.println(i);
        System.out.println(i << 2);
    }
}
