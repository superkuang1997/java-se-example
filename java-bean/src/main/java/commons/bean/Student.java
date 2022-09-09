package commons.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author by yorua
 * @description 实现Comparable接口并重写compareTo方法
 * @date 2020/11/10 1:53 下午
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Comparable<Student> {

    private String name;
    private int age;


    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}