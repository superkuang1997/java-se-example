package commons.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author by yorua
 * @date 2021/7/13 00:12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    private String name;

    private int salary;

    private int age;

    private String sex;

    private String area;

}