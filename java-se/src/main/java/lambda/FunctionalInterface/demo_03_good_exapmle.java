package lambda.FunctionalInterface;

/*
    使用lambda延迟加载的特性优化日志案例
 */
public class demo_03_good_exapmle {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        // 调用showLog方法，第二个参数是函数式接口，可以传递lambda表达式
        showLog(1, () -> msg1 + msg2 + msg3);
        showLog(2, () -> msg1 + msg2 + msg3);
    }


    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.buildMessage());
        }
    }
}
