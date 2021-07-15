package wrapperclass;

import org.junit.Test;

/**
 * @author by yorua
 * @classname Integer_equals
 * @description TODO
 * @date 2020/12/24 10:34 上午
 */
public class Integer_equals {

    @Test
    public void test01() {
        Integer a = 100;
        Integer b = 100;
        Integer c = 9999;
        Integer d = 9999;
        int e = 10000;
        int f = 10000;
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(e == f);
    }

    @Test
    public void test02() {
        Integer a = 1;
        int b = 1;

        Integer c = 999;
        int d = 999;
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
