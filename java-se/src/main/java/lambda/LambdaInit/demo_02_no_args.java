package lambda.LambdaInit;

public class demo_02_no_args {
    public static void main(String[] args) {
        // 调用invokeCook方法，参数传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("开饭");
            }
        });

        // 使用lambda表达式简化匿名内部类
        invokeCook(() -> {
            System.out.println("吃饭");
        });

        // 如果花括号内代码只有一行，则可以省略花括号
        invokeCook(() -> System.out.println("吃饭"));

    }

    // 定义一个方法，参数为Cook接口，方法内部调用Cook接口定义的方法
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
