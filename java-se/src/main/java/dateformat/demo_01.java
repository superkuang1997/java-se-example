package dateformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("AlibabaAvoidCommentBehindStatement")
public class demo_01 {
    public static void main(String[] args) throws ParseException {
        // 时间对象转格式化字符串
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = df.format(new Date()); // 字符串 --> 2020-08-30 06:52:27
        System.out.println(time);

        // 格式化字符串转时间对象
        String date = new String("2020-09-04 10:10:10");
        Date thetime = df.parse(date);  // 事件对象 ---> Fri Sep 04 00:34:56 GMT+08:00 2020
        System.out.println(thetime);
    }
}
