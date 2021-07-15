package lambda.FourFunctionalInterface;

import java.util.function.Consumer;

public class consumer_01_accept {
    public static void main(String[] args) {
        method("kiana", (String name)->{
            // 对传递的字符串进行消费
            System.out.println("这里省略n项操作...");
            System.out.println(name + "已经被成功消费");
        });
    }

    public static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }
}
