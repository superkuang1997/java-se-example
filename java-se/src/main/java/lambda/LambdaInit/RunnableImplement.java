package lambda.LambdaInit;

public class RunnableImplement implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
