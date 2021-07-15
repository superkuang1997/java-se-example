package lambda.LambdaInit;

import java.util.Arrays;
import java.util.Comparator;

public class demo_05_two_args {
    public static void main(String[] args) {
        // 创建数组存储Person对象
        Person[] arr = {
                new Person("kiana", 16),
                new Person("大伟", 14),
                new Person("老八", 30)
        };

        // 匿名内部类
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                // 按年龄升序排序
                return o1.getAge() - o2.getAge();
            }
        });

        // Arrays.sort方法接收数组以及Comparator接口作为参数，lambda表达式可以自动推断参数的类型

        // lambda表达式简化匿名内部类（有参数有返回值）
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o2.getAge() - o1.getAge();
        });

        // lambda表达式 省略参数类型
        Arrays.sort(arr, ((o1, o2) -> {
            return o2.getAge() - o1.getAge();
        }));

        // lambda表达式 省略参数类型 箭头后的花括号 以及 return
        Arrays.sort(arr, ((o1, o2) -> o2.getAge() - o1.getAge()));

    }
}
