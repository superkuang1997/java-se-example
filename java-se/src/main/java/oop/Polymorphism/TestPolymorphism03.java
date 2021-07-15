package oop.Polymorphism;

public class TestPolymorphism03 {
    public static void main(String[] args) {
        Animal a = new Cat();
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.seeDoor();
        } else {
            Cat c = (Cat) a;
            c.catchMouse();
        }

    }

    // 测试类中定义一个静态方法，参数为实现类的对象
    static void animalCry(Animal a) {
        a.shout();
    }
}

