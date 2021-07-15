package lambda.FourFunctionalInterface;

import java.util.function.Function;

public class function_01_apply {
    public static void main(String[] args) {
        method("15", (String s) -> Integer.parseInt(s));
    }

    public static void method(String s, Function<String, Integer> function) {
        Integer integer = function.apply(s);
        System.out.println(integer.getClass());
    }
}
