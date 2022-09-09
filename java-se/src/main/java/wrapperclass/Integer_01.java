package wrapperclass;

/**
 * 装箱与拆箱
 * @date 2020/11/9 3:59 下午
 * @author by yorua
 */
public class Integer_01 {
    public static void main(String[] args) {
        /**
         *   a, b -> 包装类
         *   c, d -> 基本数据类型
         */
        // 装箱
        Integer a = new Integer(10);

        Integer b = Integer.valueOf(10);  // 优先从缓存中获取Integer对象
        // 自动装箱
        Integer c = 10;  // 相当于 Integer c = Integer.valueOf(10);

        // 拆箱
        int d = a.intValue();  // intValue方法获得Integer对象的值(int)
        // 自动拆箱
        int e = a;

    }
}
