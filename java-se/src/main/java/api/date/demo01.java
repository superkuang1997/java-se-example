package api.date;

import java.util.Date;

public class demo01 {
    public static void main(String[] args) {
        Date d1 = new Date();      // Thu Oct 15 08:52:02 GMT+08:00 2020
        Date d2 = new Date(0L);      // Thu Jan 01 08:00:00 GMT+08:00 1970
        Date d3 = new Date(100000000000L);  // Sat Mar 03 17:46:40 GMT+08:00 1973
        d1.getTime();    // 获取时间戳 1598784249508
        d1.after(d2);   // 判断是否在某一时间之后  true
        d1.before(d2);  // 判断是否在某一时间之前  false
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
