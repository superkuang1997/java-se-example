package api.random;

import java.util.Random;

/**
 * @author by yorua
 * @classname Random_demo
 * @description TODO
 * @date 2021/3/12 14:56
 */
public class Random_demo {
    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        random.nextInt(0);
        System.out.println(random.nextInt(10));
    }
}
