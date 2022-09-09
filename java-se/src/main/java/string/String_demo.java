package string;

import org.junit.Test;

/**
 * @Classname String_01
 * @Description TODO
 * @date 2020/11/9 4:56 下午
 * @author by yorua
 */
public class String_demo {
    @Test
    public void test01() {
        // substring方法含头不含尾
        String s1 = new String("ABCD");
        System.out.println(s1.substring(0, s1.length() - 1));  // ABC
        System.out.println(s1.substring(0, s1.length()));  // ABCD
        System.out.println(s1.substring(0,1));
    }

}
