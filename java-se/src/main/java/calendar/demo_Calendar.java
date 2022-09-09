package calendar;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class demo_Calendar {

    @Test
    public void testA() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        calendar.add(Calendar.YEAR, 1);
        System.out.println(calendar);
        System.out.println(calendar.getTime());

    }

    @Test
    public void testB() {
        Calendar calendar = new GregorianCalendar(2000, 7, 30, 18, 55, 30);
        System.out.println(calendar);
    }
}
