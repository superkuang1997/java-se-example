package collection.queue;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author by yorua
 * @date 2021/7/3 17:01
 */
public class Queue_demo_01 {
    /**
     *
     */
    @Test
    public void test01() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        Integer poll = queue.poll();
        System.out.println(queue.peek());
    }

    @Test
    public void test02() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(null);
        queue.offer(null);
        System.out.println(queue);
    }
}
