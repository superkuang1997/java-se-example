package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Classname Prop
 * @Description 描述所要执行的类名和方法名
 * @date 2020/11/14 6:47 下午
 * @author by yorua
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Prop {
    String className();
    String Method();
}

