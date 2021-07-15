package lambda.FourFunctionalInterface;

import java.util.function.Consumer;

public class consumer_02_andThen {
    public static void main(String[] args) {
        // 调用method1方法，传递一个字符串，两个lambda表达式
        method1("Hello",
                (t) -> System.out.println(t.toUpperCase()),
                (t) -> System.out.println(t.toLowerCase()));
        // 使用andThen方法，将两个Comsumer接口连接到一起再进行消费
        method2("World",
                (t) -> System.out.println(t.toUpperCase()),
                (t) -> System.out.println(t.toLowerCase()));
    }

    public static void method1(String s, Consumer<String> con1, Consumer<String> con2) {
        con1.accept(s);
        con2.accept(s);
    }

    public static void method2(String s, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(s);
    }
}
