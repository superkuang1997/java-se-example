package lambda.FourFunctionalInterface;

import java.util.function.Supplier;

public class supplier_02_get {
    public static void main(String[] args) {
        int[] arr = {50, 25, -100, 99, 32, 8, -20};
        // 调用getMax方法获取数组的最大值
        // 逻辑具体实现由传入的Supplier接口实现类决定
        int maxValue = getMax( () -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中的最大值为：" + maxValue);
    }

    public static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
