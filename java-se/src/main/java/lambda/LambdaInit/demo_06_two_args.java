package lambda.LambdaInit;

public class demo_06_two_args {
    public static void main(String[] args) {
        // 匿名内部类
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // lambda简化匿名内部类（有参数有返回值）
        invokeCalc(20, 30, (int a, int b) -> {
            return a * b;
        });

        // 省略参数类型以及花括号
        invokeCalc(20, 30, (a, b) -> a / b);
    }

    // 定义一个方法：参数传递两个int类型整数，以及Calculator接口，方法内部调用Calculator接口中的方法
    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
