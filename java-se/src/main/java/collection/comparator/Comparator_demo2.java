package collection.comparator;

import commons.bean.Student;

import java.util.*;

public class Comparator_demo2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student p1 = new Student("刘备", 58);
        Student p2 = new Student("赵云", 28);
        Student p3 = new Student("关羽", 48);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // sort方法的第二个参数中传入Comparator的匿名内部类，重写compare方法
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student p1, Student p2) {
                return p1.getAge() - p2.getAge();
            }
        });



        for (Iterator iter = list.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
