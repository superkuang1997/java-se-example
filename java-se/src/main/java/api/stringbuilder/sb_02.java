package api.stringbuilder;

/**
 * @Classname sb_01
 * @Description TODO
 * @Date 2020/11/9 5:31 下午
 * @Created by admin
 */
public class sb_02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("test").append(100);
        System.out.println(sb.length());
//        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb);
    }
}
