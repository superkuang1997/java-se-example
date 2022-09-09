package string;

import org.junit.Test;

/**
 * @author by yorua
 * @date 2021/3/26 15:02
 */
public class String_compareTo {
    @Test
    public void test01() {
        String a = "10";
        String b = "11";
        System.out.println(a.compareTo(b));
    }

    @Test
    public void test02() {
        // 大于 则返回1
        System.out.println("303".compareTo("302"));
        // 等于 则返回0
        System.out.println("303".compareTo("303"));
        // 小于 则返回负数
        System.out.println("303".compareTo("304"));
        System.out.println("303".compareTo("330"));
    }
}
