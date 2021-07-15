package variables;

public class demo_可变参数 {
    public static void main(String[] args) {
        add(7, 8, 9);
    }

    public static int add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
