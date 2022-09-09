package lambda.LambdaInit;

/**
 * @Classname demo_07
 * @Description TODO
 * @date 2020/11/11 1:36 下午
 * @author by yorua
 */
public class demo_04_one_args {
    public static void main(String[] args) {
        // 如果花括号中的代码大于一行，则不能省略
        invokeFly("A310", mod -> {
            System.out.println("当前型号：" + mod);
            return false;
        });

        // 如果花括号的代码等于一行，则可以省略
        invokeFly("A320", mod -> true);
    }

    public static void invokeFly(String model, Fly fly) {
        System.out.println("起飞");
        fly.takeOff(model);
    }
}
