package reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @Classname ref_04
 * @Description 构造方法
 * @date 2020/11/13 8:07 下午
 * @author by yorua
 */
public class demo_05_Constructor {
    @Test
    public void test() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = new Person();

        // 空参数的构造方法
        Constructor constructor01 = personClass.getConstructor();
        // 有参数的构造方法
        Constructor constructor02 = personClass.getConstructor(String.class, int.class);
        // 创建对象
        Object obj1 = constructor01.newInstance();
        Object obj2 = constructor02.newInstance("KIANA", 16);

        // Class提供了空参构造的简便方法，使用Class对象的方法创建
        Object obj3 = personClass.newInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
