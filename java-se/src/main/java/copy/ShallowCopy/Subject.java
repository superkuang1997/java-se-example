package copy.ShallowCopy;

/**
 * @author by yorua
 * @classname Subject
 * @description TODO
 * @date 2021/3/30 10:54
 */
public class Subject {

    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[Subject: " + this.hashCode() + ",name:" + name + "]";
    }
}
