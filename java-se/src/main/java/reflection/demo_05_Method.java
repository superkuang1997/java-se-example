package reflection;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @Classname ref_05_Method
 * @Description TODO
 * @Date 2020/11/14 10:23 上午
 * @Created by admin
 */
public class demo_05_Method {
    @Test
    public void test01() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = new Person();

        // 获取无参方法
        Method eatMethod1 = personClass.getMethod("eat");
        eatMethod1.invoke(person);

        // 获取有参方法
        Method eatMethod2 = personClass.getMethod("eat", String.class);
        eatMethod2.invoke(person, "peach");
    }

    @Test
    public void test02(){
        Class<Person> personClass = Person.class;
        // 获得所有public修饰的方法
        Method[] methods = personClass.getMethods();
        // 打印方法对象
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
