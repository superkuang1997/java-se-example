package string;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author by yorua
 * @date 2021/8/8 17:34
 */
public class String_split {
    @Test
    public void test() {
        String s = "    ";
        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));
    }
}
