package lambda.MethodRefernce;

public class demo_03 {
    public static void main(String[] args) {
        // Lambda表达式
        int num1 = method(-10, number -> Math.abs(number));
        // 方法引用
        int num2 = method(-10, Math::abs);
        System.out.println(num1);
        System.out.println(num2);
    }

    public static int method(int number, Callable callable) {
        return callable.calAbs(number);
    }
}
