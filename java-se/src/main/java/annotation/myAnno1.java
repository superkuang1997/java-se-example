package annotation;

/**
 * @Classname myAnno0
 * @Description TODO
 * @Date 2020/11/14 11:46 上午
 * @Created by admin
 */
public @interface myAnno1 {
    public abstract int age();
    public abstract String name() default "Yorua";
    public abstract Student person();
    public abstract otherAnno anno();
    public abstract int[] arr();
}
