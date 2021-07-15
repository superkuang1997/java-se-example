package collection.comparable;


import commons.bean.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_demo {
    public static void main(String[] args) {
        Student p1 = new Student("祖尔金", 38);
        Student p2 = new Student("古尔丹", 58);
        Student p3 = new Student("阿尔萨斯", 28);
        List<Student> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        Collections.sort(list);

        for (Student p: list) {
            System.out.println(p);
        }
    }
}


