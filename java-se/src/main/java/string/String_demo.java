package string;

/**
 * @Classname String_01
 * @Description TODO
 * @Date 2020/11/9 4:56 下午
 * @Created by admin
 */
public class String_demo {
    public static void main(String[] args) {
        // substring方法含头不含尾
        String s1 = new String("ABCD");
        System.out.println(s1.substring(0, s1.length() - 1));  // ABC
        System.out.println(s1.substring(0, s1.length()));  // ABCD
        System.out.println(s1.substring(0,1));
    }

}
