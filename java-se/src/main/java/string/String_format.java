package string;

import org.junit.Test;

/**
 * @author by yorua
 * @classname String_format
 * @description TODO
 * @date 2020/12/23 7:24 下午
 */
public class String_format {
    @Test
    public void test() {
        String template = "%s，早上好！";
        System.out.println(String.format(template, "儿子"));
    }
}
