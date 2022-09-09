package random;

import org.junit.Test;

import java.util.Random;

/**
 * @author by yorua
 * @date 2021/3/12 14:56
 */
public class Random_demo {
    private static final Random random = new Random(System.currentTimeMillis());

    @Test
    public void test01() {
        System.out.println(random.nextInt());
        // 生成[0, 50)
        System.out.println(random.nextInt(50));
        // 生成[0, 100)
        System.out.println(random.nextInt(100));
    }

    @Test
    public void test02() {
        // 生成[5, 10)
        System.out.println(5 + random.nextInt(5));

    }
}
