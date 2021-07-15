package oop.Polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        animalCry(a);  // 叫了一声
        animalCry(c);  // 喵喵喵
        animalCry(d);  // 汪汪汪

    }

    // 测试类中定义一个静态方法，参数为实现类的对象
    static void animalCry(Animal a) {
        a.shout();
    }
}

// 动物是父类，猫和狗是子类
class Animal {
    public void shout() {
        System.out.println("叫了一声");
    }
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }

    public void seeDoor() {
        System.out.println("看门");
    }
}

