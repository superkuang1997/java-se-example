package stringutils;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * @author by yorua
 * @date 2021/8/8 16:42
 */
public class StringUtilsDemo {
    @Test
    public void test() {
        String[] strings = new String[] {"aa", "bb", "cc"};
        String join = StringUtils.join(strings);
        System.out.println(join);
    }
}
