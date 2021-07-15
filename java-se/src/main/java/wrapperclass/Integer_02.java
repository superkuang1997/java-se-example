package wrapperclass;

/**
 * @Classname Integer_02
 * @Description 基本类型与字符串之间的转换
 * @Date 2020/11/9 4:04 下午
 * @Created by admin
 */
public class Integer_02 {
    public static void main(String[] args) {
        Int2Str();
        Str2Int();

    }

    public static void Int2Str() {
        Integer a = 10;
        // 包装类的toString方法
        String s1 = a.toString();

        // String类的valueOf方法
        String s2 = String.valueOf(a);  // 本质上也调用了toString方法
        
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void Str2Int() {
        String s = "100";
        // 各种包装类的parseXXX方法
        int i = Integer.parseInt(s);
        System.out.println(i);


    }
}
