package lambda.FunctionalInterface;

public class demo04 {
    public static void main(String[] args) {
        // 传递匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        // 方法的参数是函数式接口，可以传递lambda表达式
        startThread(
                () -> System.out.println(Thread.currentThread().getName()));
    }

    public static void startThread(Runnable runnable) {
        new Thread(runnable).start();
    }
}
