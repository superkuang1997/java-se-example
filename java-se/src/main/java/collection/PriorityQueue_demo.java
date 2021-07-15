package collection;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author by yorua
 * @classname Queue_
 * @description TODO
 * @date 2021/3/12 13:49
 */
public class PriorityQueue_demo {
    @Test
    public void test01() {
        // 出堆一定是有序的
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(9);
        pq.add(100);
        pq.add(20);
        for (Integer integer : pq) {
            System.out.println(integer);
        }
        System.out.println("------------");
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }

    @Test
    public void test02() {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(5);
        pq.add(8);
        for (Integer integer : pq) {
            System.out.println(integer);
        }

    }
}
