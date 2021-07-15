package reflection;

import org.junit.Test;

/**
 * @Classname ref_01
 * @Description 获得class对象的几种方式
 * @Date 2020/11/12 5:28 下午
 * @Created by admin
 */
public class demo_02_getClass {

    @Test
    public void test01() throws ClassNotFoundException {
        // way1
        // 使用 Class.forName 静态方法。当知道该类的全路径名时，可以使用该方法获取 Class 类对象。
        Class cls01 = Class.forName("reflection.Person");
        System.out.println(cls01);

        // way2
        // 这种方法只适合在编译前就知道操作的 Class
        Class cls02 = Person.class;
        System.out.println(cls02);

        // way3
        // 使用类对象的 getClass() 方法
        Person person = new Person();
        Class cls03 = person.getClass();
        System.out.println(cls03);

        // 比较是否是同一个对象
        System.out.println(cls01 == cls02);
        System.out.println(cls01 == cls03);
    }
}
