package collection.deque;

import org.junit.Test;

import java.util.*;

/**
 * @author by yorua
 * @date 2021/2/22 18:14
 */
public class Deque_demo_02 {
    @Test
    public void test01() {
        Deque deque = new ArrayDeque<>();
        deque.push(10);
        deque.push(20);
        deque.push(5);
        deque.push(25);
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
    }

    @Test
    public void test02() {
        Deque deque = new LinkedList();
        deque.push(10);
        deque.push(20);
        deque.push(5);
        deque.push(25);
        deque.addFirst(50);
        System.out.println(deque);
        deque.pop();
        System.out.println(deque);
        System.out.println(deque.removeLast());
    }

    @Test
    public void test03() {
        Deque deque1 = new LinkedList();
        deque1.add(3);
        deque1.add(8);
        deque1.add(10);
        deque1.add(4);
        System.out.println(deque1);
        deque1.remove();
        System.out.println(deque1);

        Deque deque2 = new LinkedList();
        deque2.addFirst(3);
        deque2.addFirst(6);
        deque2.addFirst(7);
        List list = new ArrayList<>();
        list.add(deque1);
        list.add(deque2);
        System.out.println(list);


    }

}
