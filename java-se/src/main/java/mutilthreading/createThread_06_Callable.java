package mutilthreading;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author by yorua
 * @classname createThread_Callable
 * @description TODO
 * @date 2021/1/19 9:53 上午
 */
public class createThread_06_Callable {
    public static void main(String[] args) throws Exception {
        CallableImpl myThread = new CallableImpl();
        FutureTask futureTask = new FutureTask(myThread);
        new Thread(futureTask, "A").start();
        System.out.println("main ... over");
        System.out.println(futureTask.get());
    }
}


class CallableImpl implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("开始计算.......");
        TimeUnit.SECONDS.sleep(3);
        return 1024;
    }
}
