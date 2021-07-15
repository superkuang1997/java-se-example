package lambda.FourFunctionalInterface;

import java.util.function.Predicate;

/**
 * 逻辑表达式
 */
public class predicate_03_or {
    public static void main(String[] args) {
        String s = "Hello";
        boolean b1 = checkString1(s,
                (s1) -> s1.contains("o"),
                (s1) -> s1.contains("b"));
        System.out.println(b1);

        boolean b2 = checkString2(s,
                (s1) -> s1.contains("o"),
                (s1) -> s1.contains("b"));
        System.out.println(b2);
    }

    public static boolean checkString1(String s, Predicate<String> pred1, Predicate<String> pred2) {
        return pred1.test(s) || pred2.test(s);
    }

    public static boolean checkString2(String s, Predicate<String> pred1, Predicate<String> pred2) {
        return pred1.or(pred2).test(s);
    }
}
