package string;

import org.junit.Test;

/**
 * @date 2020/11/9 5:31 下午
 * @author  by yorua
 */
public class sb_01 {
    @Test
    public void test01() {
        StringBuilder sb = new StringBuilder();
        // 获得hashCode
        System.out.println(sb.hashCode());
        // 将十进制的hashCode转为十六进制
        System.out.println(Integer.toHexString(sb.hashCode()));
    }

    @Test
    public void test02() {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString().getClass());
    }
    @Test
    public void test03() {
        StringBuilder sb = new StringBuilder("a blue sky");
        sb.setLength(6);
        System.out.println(sb.toString());
        sb.setLength(100);
        System.out.println(sb.toString());
    }

}
