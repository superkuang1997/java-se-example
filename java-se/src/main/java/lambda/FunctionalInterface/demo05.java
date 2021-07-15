package lambda.FunctionalInterface;

import java.util.Arrays;
import java.util.Comparator;

public class demo05 {
    public static void main(String[] args) {
        String[] arr = {"aaa", "b", "ccccccc", "dd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, getComparator03());
        System.out.println(Arrays.toString(arr));
    }

    public static Comparator<String> getComparator01() {
        // 返回一个匿名内部类
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按字符串长度降序排列
                return o2.length() - o1.length();
            }
        };
    }

    // 返回Lambda表达式
    public static Comparator<String> getComparator02() {
        return (String o1, String o2) -> {
            return o2.length() - o1.length();
        };
    }

    // 返回简化后的Lambda表达式
    public static Comparator<String> getComparator03() {
        return (o1, o2) -> o2.length() - o1.length();
    }
}
