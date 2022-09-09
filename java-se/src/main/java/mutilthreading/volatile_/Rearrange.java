package mutilthreading.volatile_;

/**
 * @author by yorua
 * @classname Rearange
 * @description TODO
 * @date 2021/1/26 20:30
 */
public class Rearrange {
    private static int a = 0;
    private static boolean flag = false;

    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
            a = 1;
            flag = true;
        }, "A").start();

        new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
            if (flag) {
                int i = a * a;
                System.out.println(i);
            }
        }, "B").start();
    }
}
