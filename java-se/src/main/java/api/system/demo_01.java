package api.system;

public class demo_01 {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
