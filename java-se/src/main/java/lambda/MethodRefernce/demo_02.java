package lambda.MethodRefernce;

public class demo_02 {
    public static void main(String[] args) {
        // 使用匿名内部类
        printString(new Printable() {
            @Override
            public void print(String s) {
                MethodRefObject obj = new MethodRefObject();
                obj.printUpperString(s);
            }
        });

        // 使用lambda表达式
        printString(s -> {
            MethodRefObject obj = new MethodRefObject();
            obj.printUpperString(s);
        });

        // 使用方法引用
        MethodRefObject obj = new MethodRefObject();
        printString(obj::printUpperString);
    }

    public static void printString(Printable printable) {
        printable.print("Hello World");
    }
}


class MethodRefObject {
    public void printUpperString(String string) {
        System.out.println(string.toUpperCase());
    }
}
