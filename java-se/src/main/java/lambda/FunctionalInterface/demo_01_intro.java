package lambda.FunctionalInterface;

/*
    函数式接口：一般可以作为方法的参数和返回值类型
 */
public class demo_01_intro {
    public static void main(String[] args) {
        // 传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());

        // 匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("method02");
            }
        });

        // lambda表达式
        show(()->{
            System.out.println("method03");
        });

        // lambda表达式 简化一下
        show(()-> System.out.println("method04"));
    }

    public static void show(MyFunctionalInterface myInter) {
        myInter.method();

    }
}
