package lambda.FunctionalInterface;

/*
   日志案例
 */

public class demo_02_bad_example {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
        // 调用showLog方法，传递日志级别和日志信息
        showLog(1, msg1 + msg2 + msg3);
        showLog(2, msg1 + msg2 + msg3);
    }

    // msg传递的是拼接后的字符串
    public static void showLog(int level, String msg) {
        if (level == 1) {
            System.out.println(msg);
        }
    }
}
