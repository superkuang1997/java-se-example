package api.stringbuilder;

import java.util.Arrays;

/**
 * @author by yorua
 * @classname sb_04
 * @description TODO
 * @date 2021/4/6 10:55
 */
public class sb_04 {
    public static void main(String[] args) {
        String s = "a blue sky";
        String[] s1 = s.trim().split(" ");
        System.out.println(Arrays.toString(s1));
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.reverse();
        System.out.println(s.substring(0,2));
    }
}
