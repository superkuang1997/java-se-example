package reflection;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @Classname ref_02
 * @Description 获取成员变量
 * @date 2020/11/13 8:02 下午
 * @author by yorua
 */

public class demo_03_getAttribute {

    @Test
    public void test01() throws Exception {
        // 获取Person的Class对象
        Class<Person> personClass = Person.class;

        // 获取单个public修饰的成员变量
        Field address = personClass.getField("address");
        System.out.println(address);

        // 获得成员变量，不考虑访问控制符
        Field name = personClass.getDeclaredField("name");
        System.out.println(name);

    }

    @Test
    public void test02(){
        // 获取Person的Class对象
        Class<Person> personClass = Person.class;

        // 获取public修饰的所有成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    @Test
    public void test03(){
        // 获取Person的Class对象
        Class<Person> personClass = Person.class;
        // 获取所有成员变量，不考虑访问修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field field: declaredFields) {
            System.out.println(field);
        }
    }


}
