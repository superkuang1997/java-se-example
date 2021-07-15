package lambda.FourFunctionalInterface;

import java.util.function.Supplier;

/**
 * @Classname supplier_01
 * @Description TODO
 * @Date 2020/11/11 3:16 下午
 * @Created by admin
 */
public class supplier_01_get {
    public static void main(String[] args) {
        String suffix = ".rar";
        String upper = invokeSupply(()-> suffix.toUpperCase());
        System.out.println(upper);
    }

    public static String invokeSupply(Supplier<String> supplier) {
        return supplier.get();
    }
}
