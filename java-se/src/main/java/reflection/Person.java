package reflection;

public class Person {
    private String name;
    private int age;
    public String address;
    public String school;
    public String rank;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    public void eat() {
        System.out.println("eat...");
    }

    public void eat(String food) {
        System.out.println("eat..." + food);
    }
}
