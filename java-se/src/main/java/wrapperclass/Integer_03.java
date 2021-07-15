package wrapperclass;

/**
 * @Classname Integer_03
 * @Description 包装类的缓存
 * @Date 2020/11/9 4:17 下午
 * @Created by admin
 */
public class Integer_03 {
    public static void main(String[] args) {

    }

    public static void test01() {
        // 1024不在缓存范围
        Integer int1 = Integer.valueOf(1024);
        Integer int2 = Integer.valueOf(1024);
        System.out.println(int1 == int2);        // false
        System.out.println(int1.equals(int2));    // true
    }

    public static void test02() {
        // 100在缓存范围
        Integer int3 = Integer.valueOf(100);
        Integer int4 = Integer.valueOf(100);
        System.out.println(int3 == int4);       // true
        System.out.println(int3.equals(int4));  // true
    }

    public static void test03() {
        // new Integer会创建新的对象，不会从缓存中返回对象
        Integer int1 = Integer.valueOf(100);
        Integer int2 = Integer.valueOf(100);
        Integer int3 = new Integer(100);
        System.out.println(int1 == int2);  // true
        System.out.println(int1 == int3);  // false
    }


}
