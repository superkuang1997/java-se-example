package mutilthreading.ThreadCollaboration;

/**
 * @author by yorua
 * @classname TwoThreadExample
 * @description 两个线程，一个线程负责+1，另一个线程负责-1，循环打印0和1
 *              只有两个线程，不会发生虚假唤醒问题
 * @date 2021/1/18 4:12 下午
 */
public class TC_02_TwoThread {
    public static void main(String[] args) {
        CounterD counter = new CounterD();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    counter.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    counter.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, "B").start();

    }
}

class CounterA {
    int number = 0;

    public synchronized void increment() throws InterruptedException {
        if (number != 0) {
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        notifyAll();

    }

    public synchronized void decrement() throws InterruptedException {
        if (number == 0) {
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        notifyAll();
    }
}
