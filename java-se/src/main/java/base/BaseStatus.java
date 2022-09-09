package base;

import org.junit.Test;

/**
 * @author by yorua
 * @date 2021/10/3 10:00
 */
public class BaseStatus {
    @Test
    public void test() {
        System.out.println("availableProcessors：" + Runtime.getRuntime().availableProcessors());
        long freeMemory = Runtime.getRuntime().freeMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        // 单位：字节
        System.out.println("freeMemory：" + freeMemory + "bytes，" + freeMemory / (1024 * 1024) + "mb");
        System.out.println("totalMemory：" + totalMemory + "bytes，" + totalMemory / (1024 * 1024) + "mb");
        System.out.println("maxMemory：" + maxMemory + "bytes，" + maxMemory / (1024 * 1024) + "mb");
    }
}
