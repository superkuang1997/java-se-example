package io.SerializerStream;

import java.io.Serializable;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2020/11/13 3:07 下午
 * @Created by admin
 */
public class Student implements Serializable {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
