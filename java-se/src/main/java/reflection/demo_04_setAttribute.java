package reflection;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @Classname ref_03
 * @Description 设置成员变量
 * @date 2020/11/13 8:02 下午
 * @author by yorua
 */
public class demo_04_setAttribute {

    @Test
    public void test() throws Exception {
        // 获取Person的Class对象
        Class<Person> personClass = Person.class;

        // 获取单个public修饰的成员变量
        Field address = personClass.getField("address");

        // 获得成员变量，不考虑访问控制符
        Field name = personClass.getDeclaredField("name");

        // 创建对象
        Person person = new Person("KIANA", 18);

        // 获取与设置public修饰的成员变量
        System.out.println(address.get(person));  // 获取person对象的address值
        address.set(person, "圣芙蕾雅学园");  // 设置person对象address的值

        // 获取与设置成员变量，不考虑访问修饰符
        name.setAccessible(true);  // 忽略访问权限修饰符的安全检查
        System.out.println(name.get(person));
        name.set(person, "YING");

        System.out.println(person);
    }
}
