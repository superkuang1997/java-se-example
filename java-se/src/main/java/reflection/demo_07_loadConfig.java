package reflection;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class demo_07_loadConfig {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // 创建Properties对象
        Properties prop = new Properties();
        // 获取字节码文件对应的类加载器
        ClassLoader classLoader = demo_07_loadConfig.class.getClassLoader();
        InputStream stream = classLoader.getResourceAsStream("reflection/prop.properties"); // 直接将资源转为字节输入流
        System.out.println(classLoader.getResource("reflection/prop.properties"));  // 返回资源所在路径
        prop.load(stream);

        // 获取配置文件中定义的数据
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        // 将该类加载进内存
        Class cls = Class.forName(className);
        // 创建对象
        Object obj = cls.newInstance();
        // 获取方法对象
        Method method = cls.getMethod(methodName);
        // 执行方法
        method.invoke(obj);
    }
}
