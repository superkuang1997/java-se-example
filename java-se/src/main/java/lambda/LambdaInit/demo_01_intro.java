package lambda.LambdaInit;

public class demo_01_intro {
    public static void main(String[] args) {
        // way1 实现Runnable接口，再传递给Thread的构造方法
        Runnable run1 = new RunnableImplement();
        Thread t = new Thread(run1);
        t.start();

        // way2 匿名内部类重写run方法，再传递给Thread的构造方法
        Runnable run2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(run2).start();

        // way3 简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        // way4 无参数无返回值的lambda表达式
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }
        ).start();
    }
}
