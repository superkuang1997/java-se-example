package wrapperclass;

import org.junit.Test;

/**
 * @author by yorua
 * @date 2021/8/7 17:08
 */
public class Character_demo_01 {
    @Test
    public void char2int() {
        // 转ascii
        System.out.println('a' - 0);  // a -> 97
        System.out.println('A' - 0);  // A -> 65
        System.out.println('0' - 0);  // 0 -> 48
        System.out.println('5' - 0);  // 5 -> 53
        System.out.println('0' - '0');
        System.out.println('5' - '0');
    }

    @Test
    public void int2char() {
        int a = 97;
        System.out.println((char)a);

    }
}
