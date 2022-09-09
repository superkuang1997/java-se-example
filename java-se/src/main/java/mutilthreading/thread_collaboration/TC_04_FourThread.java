package mutilthreading.thread_collaboration;

/**
 * @author by yorua
 * @classname TwoThreadExample
 * @description 四个线程，两个线程负责+1，另外两个线程负责-1，循环打印0和1
 *              使用while进行判断，不会发生虚假唤醒问题
 * @date 2021/1/18 4:12 下午
 */
public class TC_04_FourThread {
    public static void main(String[] args) {
        CounterD counter = new CounterD();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(200);
                    counter.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(300);
                    counter.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(250);
                    counter.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, "C").start();

        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(400);
                    counter.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, "D").start();

    }
}

class CounterC {
    int number = 0;

    public synchronized void increment() throws InterruptedException {
        while (number != 0) {
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        notifyAll();

    }

    public synchronized void decrement() throws InterruptedException {
        while (number == 0) {
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        notifyAll();
    }
}
