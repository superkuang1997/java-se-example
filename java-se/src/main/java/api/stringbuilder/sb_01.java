package api.stringbuilder;

/**
 * @Classname sb_01
 * @Description TODO
 * @Date 2020/11/9 5:31 下午
 * @Created by admin
 */
public class sb_01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 获得hashCode
        System.out.println(sb.hashCode());
        // 将十进制的hashCode转为十六进制
        System.out.println(Integer.toHexString(sb.hashCode()));
    }
}
