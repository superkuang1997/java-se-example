package lambda.LambdaInit;

/**
 * @Classname demoo
 * @Description TODO
 * @Date 2020/11/11 1:15 下午
 * @Created by admin
 */
public class demo_03_one_args {
    public static void main(String[] args) {
        // 参数类型可省略
        invokePrint("hello", (string) -> {
            System.out.println(string);
        });

        // 括号内的参数只有一个，括号也可以省略
        invokePrint("hello", string -> {
            System.out.println(string);
        });

        // 花括号内代码只有一行，花括号也可以省略
        invokePrint("test", str -> System.out.println(str));
    }

    public static void invokePrint(String str, Printer printer) {
        printer.justPrint(str);
    }
}
