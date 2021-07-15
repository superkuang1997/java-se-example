package string;

/**
 * @author by yorua
 * @classname String_safe
 * @description TODO
 * @date 2021/3/14 09:11
 */
public class String_safe {
    public static String appendStr(String s) {
        s += "bbb";
        return s;
    }

    public static void main(String[] args) {
        String s = new String("aaa");
        String s1 = appendStr(s);
        System.out.println(s);
    }
}
