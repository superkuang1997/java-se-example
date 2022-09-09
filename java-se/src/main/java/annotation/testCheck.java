package annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @Classname testCheck
 * @Description 简单的测试框架
 * @date 2020/11/14 10:36 下午
 * @author by yorua
 */

// 当主方法执行后，会自动自行被检测的所有方法（加了Check注解的方法），判断方法是否有异常
public class testCheck {
    public static void main(String[] args) throws IOException {
        Calculator cal = new Calculator();
        Class cls = cal.getClass();
        Method[] methods = cls.getMethods();
        int number = 0;
        FileWriter writer = new FileWriter("JavaSE/src/Annotation/bug.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        for (Method method : methods) {
            // 判断方法上是否有注解
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(cal);
                } catch (Exception e) {
                    bw.write(method.getName() + "方法存在异常");
                    bw.newLine();
                    bw.write("异常的类型：" + e.getCause().getClass().getName());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("--------");
                    bw.newLine();
                    number++;
                }
            }

        }
        bw.write("本次测试一共出现" + number + "次异常");
        bw.close();


    }
}
