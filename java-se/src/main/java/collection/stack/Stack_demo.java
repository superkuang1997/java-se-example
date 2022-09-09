package collection.stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author by yorua
 * @date 2021/8/9 10:56
 */
public class Stack_demo {
    @Test
    public void test() {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.isEmpty();
        stack.empty();
    }
}
