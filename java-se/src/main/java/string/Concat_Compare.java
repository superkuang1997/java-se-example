package string;

/**
 * @author by yorua
 * @date 2021/9/16 22:38
 */
public class Concat_Compare {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();
        StringBuilder sb1 = new StringBuilder();
        StringBuffer sb2 = new StringBuffer();
        int num = 100000;

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            s1 += "A";
        }
        long t1 = System.currentTimeMillis();

        for (int i = 0; i < num; i++) {
            s2 = s2.concat("a");
        }
        long t2 = System.currentTimeMillis();

        for (int i = 0; i < num; i++) {
            sb1.append("A");
        }
        long t3 = System.currentTimeMillis();

        for (int i = 0; i < num; i++) {
            sb2.append("B");
        }
        long t4 = System.currentTimeMillis();
        System.out.println("String [+]\f" + (t1 - t0)
                + "\nString [concat()]\f" + (t2 - t1)
                + "\nStringBuilder [append()]\f" + (t3 - t2)
                + "\nStringBuffer [append()]\f" + (t4 - t3));
    }

}
