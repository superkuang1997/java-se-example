package oop.InnerClass;

public class Outer {
    public void methodOuter() {
        // 局部内部类
        class Inner {
            int num = 10;
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
