package mutilthreading.JUC;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author by yorua
 * @classname SaleTicket
 * @description TODO
 * @date 2021/1/18 1:59 下午
 */
public class SaleTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                ticket.saleTicket();
            }
        }, "A").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    ticket.saleTicket();
                }
            }
        }, "B").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    ticket.saleTicket();
                }
            }
        }, "C").start();
    }
}

/**
 * 资源类
 */
class Ticket {
    private int ticket = 10000;
    private Lock lock = new ReentrantLock();

    public void saleTicket() {
        try {
            lock.lock();
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "\t卖出第" + ticket-- + "\t还剩下" + ticket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}