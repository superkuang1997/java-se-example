package copy.ShallowCopy;

/**
 * @author by yorua
 * @classname Student
 * @description TODO
 * @date 2021/3/30 10:54
 */

public class Student implements Cloneable {

    //引用类型
    private Subject subject;
    //基础数据类型
    private String name;
    private int age;


    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 重写clone()方法
     *
     * @return
     */
    @Override
    public Student clone() {
        //浅拷贝
        try {
            // 直接调用父类的clone()方法
            return (Student)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "[Student: " + this.hashCode() + ",subject:" + subject + ",name:" + name + ",age:" + age + "]";
    }
}
