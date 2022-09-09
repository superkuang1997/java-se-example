package objects;

import org.junit.Test;

import java.util.Objects;

/**
 * @author by yorua
 * @description TODO
 * @date 2021/7/17 17:35
 */
public class Objects_equals {
    @Test
    public void test() {
        System.out.println(Objects.equals(null, null));
        System.out.println(Objects.equals("a", null));
        System.out.println(Objects.equals(null, "a"));
        System.out.println(Objects.equals("a", "a"));

    }
}
