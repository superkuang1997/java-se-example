package reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author by yorua
 * @classname demo_whatIsReflection
 * @description TODO
 * @date 2021/1/9 2:29 下午
 */
public class demo_01_whatIsReflection {
    @Test
    public void noReflection() {
        Person person = new Person();
        person.eat();
    }

    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class cls = Class.forName("reflection.Person");
        Method method = cls.getMethod("eat");
        Constructor constructor = cls.getConstructor();
        Object obj = constructor.newInstance();
        method.invoke(obj);
    }
}
