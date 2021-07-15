package lambda.FourFunctionalInterface;

import java.util.function.Function;

public class function_02_andThen {
    public static void main(String[] args) {
        method("15",
                (String s) -> Integer.parseInt(s),
                (Integer i) -> i * 10);
    }

    // String -> Integer -> Integer
    public static void method(String s,
                              Function<String, Integer> fun1,
                              Function<Integer, Integer> fun2) {
        Integer integer = fun1.andThen(fun2).apply(s);
        System.out.println(integer);
    }
}
