package commons.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author by yorua
 * @date 2021/9/16 22:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    int id;
    String name;
    int age;


    @Override
    public boolean equals(Object obj) {
        //  地址相等
        if (this == obj) {
            return true;
        }
        // 非空性：对于任意非空引用x，x.equals(null)应该返回false。
        if (obj == null) {
            return false;
        }
        if (obj instanceof User) {
            User other = (User) obj;
            // 需要比较的字段相等，则这两个对象相等
            if (Objects.equals(this.name, other.name) && Objects.equals(this.age, other.age)) {
                return true;
            }
        }
        return false;
    }
}
