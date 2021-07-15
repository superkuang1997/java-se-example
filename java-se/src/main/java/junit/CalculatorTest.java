package junit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before
    public void init() {
        System.out.println("init...");
    }
    @After
    public void close() {
        System.out.println("close...");
    }

    @Test
    public void testAdd() {
        System.out.println("testAdd 测试方法执行");
        Calculator cal = new Calculator();
        int result = cal.add(3, 4);
        // 断言
        Assert.assertEquals(7, result);
    }
}
