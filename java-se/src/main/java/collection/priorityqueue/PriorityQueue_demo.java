package collection.priorityqueue;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author by yorua
 * @date 2021/7/12 09:16
 */
public class PriorityQueue_demo {
    @Test
    public void test01() {
        // 小根堆
        Queue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(60);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(40);
        minHeap.add(10);
        System.out.println(minHeap);
        minHeap.stream().mapToInt(v -> v).toArray();
        // 大根堆
        Queue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
    }

    @Test
    public void test02() {
        // 小根堆
        Queue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(60);
        minHeap.add(30);
        minHeap.add(40);
        minHeap.add(10);
        System.out.println(minHeap);
    }


}
