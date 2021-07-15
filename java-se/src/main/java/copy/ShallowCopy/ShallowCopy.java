package copy.ShallowCopy;

/**
 * @author by yorua
 * @classname ShallowCopy
 * @description TODO
 * @date 2021/3/30 10:44
 */
public class ShallowCopy implements Cloneable {

    public static void main(String[] args) {
        Subject s1 = new Subject("语文");

        Student stu1 = new Student();
        stu1.setName("小A");
        stu1.setAge(12);
        stu1.setSubject(s1);

        Student stu2 = stu1.clone();
        Subject s2 = stu2.getSubject();
        s2.setName("数学");

        System.out.println(stu1);
        System.out.println(stu2);
    }
}
