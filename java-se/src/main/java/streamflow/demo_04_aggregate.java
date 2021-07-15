package streamflow;

import commons.bean.Person;
import org.junit.Test;

import java.util.*;

/**
 * @author by yorua
 * @description 聚合 max、min、count
 * @date 2021/7/13 21:56
 */
public class demo_04_aggregate {

    @Test
    public void test01() {
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");

        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        Optional<String> min = list.stream().max(Comparator.comparing(s -> -1 * s.length()));
        System.out.println("最短的字符串：" + min.get());
        System.out.println("最长的字符串：" + max.get());
    }

    @Test
    public void test02() {
        List<Integer> list = Arrays.asList(7, 6, 9, 4, 11, 6);

        Optional<Integer> res1 = list.stream().max((o1, o2) -> o1 - o2);
        Optional<Integer> res2 = list.stream().max(Integer::compareTo);
        Optional<Integer> res3 = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("lambda：" + res1.get());
        System.out.println("方法引用：" + res2.get());
        System.out.println("匿名内部类：" + res3.get());
    }

    @Test
    public void test03() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Tom", 8900, 23, "male", "New York"));
        list.add(new Person("Jack", 7000, 25, "male", "Washington"));
        list.add(new Person("Lily", 7800, 21, "female", "Washington"));
        list.add(new Person("Anni", 8200, 24, "female", "New York"));
        list.add(new Person("Owen", 9500, 25, "male", "New York"));
        list.add(new Person("Alisa", 7900, 26, "female", "New York"));

        Optional<Person> res1 = list.stream().max(Comparator.comparingInt(Person::getSalary));
        Optional<Person> res2 = list.stream().max((p1, p2) -> p1.getSalary() - p2.getSalary());
        System.out.println("员工工资最大值：" + res1.get().getSalary());
        System.out.println("员工工资最大值：" + res2.get().getSalary());
    }

    @Test
    public void test04() {
        List<Integer> list = Arrays.asList(7, 6, 4, 8, 2, 11, 9);
        long count = list.stream().filter(x -> x > 6).count();
        System.out.println("list中大于6的元素个数：" + count);
    }
}
