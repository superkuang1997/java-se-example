package annotation;

/**
 * @author by yorua
 * @date 2020/11/14 11:46 上午
 */
public @interface myAnno1 {
    int age();

    String name() default "Yorua";

    Student person();

    otherAnno anno();

    int[] arr();
}
