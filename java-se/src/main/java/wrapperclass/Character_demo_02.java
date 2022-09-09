package wrapperclass;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author by yorua
 * @date 2021/3/26 14:01
 */
public class Character_demo_02 {

    @Test
    public void digit() {
        // 边界判断方法，如果在边界内直接返回int类型的值，不在边界内则返回-1
        System.out.println(Character.digit('6', 2));;
        System.out.println(Character.digit('6', 10));;
        System.out.println(Character.digit('6', 16));;
        System.out.println(Character.digit('a', 10));;
    }
}
