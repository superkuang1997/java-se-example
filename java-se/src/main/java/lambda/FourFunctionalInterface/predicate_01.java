package lambda.FourFunctionalInterface;

import java.util.function.Predicate;

/*
    对某种数据类型的数据进行判断，结果返回一个boolean值
 */
public class predicate_01 {
    public static void main(String[] args) {
        String s = "Hello";
        boolean b = checkString(s, s1 -> s1.length() > 5);
        System.out.println(b);
    }

    public static boolean checkString(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }
}
