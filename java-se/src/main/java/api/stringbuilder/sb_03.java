package api.stringbuilder;

/**
 * @author by yorua
 * @classname sb_03
 * @description TODO
 * @date 2021/3/26 14:22
 */
public class sb_03 {
    public static void main(String[] args) {
        String[] strs = new String[] {"as", "dsa", "123"};
        StringBuilder sb = new StringBuilder();
        sb.append('c');
        sb.append('c');
        sb.append('c');
        sb.deleteCharAt(sb.length() - 1);
        boolean[] used = new boolean[2];
    }
}
