package collection.deque;

import org.junit.Test;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author by yorua
 * @classname Deque_demo
 * @description TODO
 * @date 2021/2/22 18:00
 */
public class Deque_demo_01 {

    /**
     * 测试栈的方法
     */
    @Test
    public void test01() {
        Deque<Integer> deque = new LinkedList<>();
        deque.push(null);
        deque.push(null);
        deque.push(null);
        deque.pop();
        deque.pop();
        deque.pop();
        deque.isEmpty();
    }


    @Test
    public void test02() {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(4);
        deque.addLast(5);
        deque.addLast(6);
        deque.addLast(7);
        deque.addLast(8);
        for (Iterator<Integer> iter = deque.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
