package annotation;

/**
 * @Classname Calculator
 * @Description TODO
 * @date 2020/11/14 10:31 下午
 * @author by yorua
 */
public class Calculator {
    @Check
    public void add() {
        System.out.println(1 + 0);
    }

    @Check
    public void sub() {
        String string = null;
        string.toString();
        System.out.println(1 - 50);
    }

    @Check
    public void div() {
        System.out.println(1 / 0);
    }

    @Check
    public void mul() {
        System.out.println(1 * 0);
    }
}
