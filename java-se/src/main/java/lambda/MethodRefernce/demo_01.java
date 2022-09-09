package lambda.MethodRefernce;

public class demo_01 {
    public static void main(String[] args) {
        System.out.println(123);
        // 使用lambda表达式
        printString(s -> System.out.println(s));

        // 方法引用
        printString(System.out::println);
    }

    public static void printString(Printable printable) {
        printable.print("Hello World");
    }
}
