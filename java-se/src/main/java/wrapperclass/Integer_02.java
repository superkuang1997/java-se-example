package wrapperclass;

import org.junit.Test;

/**
 * 基本类型与字符串之间的转换
 *
 * @author by yorua
 * @date 2020/11/9 4:04 下午
 */
public class Integer_02 {
    @Test
    public void test01() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE / 10);
        System.out.println(Integer.MIN_VALUE / 10);
    }

    @Test
    public void test02() {
        System.out.println(-123 / 10);
        System.out.println(-123 % 10);
    }

    @Test
    public void Int2Str() {
        Integer a = 10;
        // 包装类的toString方法
        String s1 = a.toString();

        // String类的valueOf方法
        String s2 = String.valueOf(a);  // 本质上也调用了toString方法

        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void Str2Int() {
        String s = "100";
        // 各种包装类的parseXXX方法
        int i = Integer.parseInt(s);
        System.out.println(i);
    }
}
