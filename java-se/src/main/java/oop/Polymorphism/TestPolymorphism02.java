package oop.Polymorphism;

public class TestPolymorphism02 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.shout();
        Dog d = (Dog)a;
        d.seeDoor();

    }

    // 测试类中定义一个静态方法，参数为实现类的对象
    static void animalCry(Animal a) {
        a.shout();
    }
}

