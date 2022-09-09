package reflection;

import org.junit.Test;

import java.io.InputStream;
import java.net.URL;

/**
 * @Classname ref_07_ClassLoader
 * @Description TODO
 * @date 2020/11/14 10:58 上午
 * @author by yorua
 */
public class demo_06_ClassLoader {
    @Test
    public void test() throws Exception{
        Class<Person> personClass = Person.class;
        ClassLoader loader = personClass.getClassLoader();
        URL url = loader.getResource("reflection/prop.properties");
        InputStream stream = loader.getResourceAsStream("reflection/prop.properties");
        System.out.println(url);
        System.out.println(stream);

    }
}
