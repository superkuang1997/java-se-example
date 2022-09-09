package collection.hashset;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by yorua
 * @date 2021/8/17 16:40
 */
class LRUCache {

    int capacity;
    Map<Integer, Node> map = new HashMap<>();
    Node dummyHead;
    Node dummyTail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.dummyHead = new Node(-1, -1);
        this.dummyTail = new Node(-1, -1);
        dummyHead.next = dummyTail;
        dummyTail.pre = dummyHead;

    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            moveToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        // key存在，更新后提到队首
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            // 移到双端队列头部
            moveToHead(node);
            return;
        }
        // 到达最大容量
        else if (map.size() == capacity) {
            int lastKey = removeLast();
            map.remove(lastKey);
        }
        Node node = new Node(key, value);
        addFirst(node);
        map.put(key, node);

    }

    private void moveToHead(Node node) {
        removeNode(node);
        addFirst(node);
    }

    private void addFirst(Node node) {
        node.next = dummyHead.next;
        dummyHead.next.pre = node;
        node.pre = dummyHead;
        dummyHead.next = node;

    }

    private void addLast(Node node) {
        node.pre = dummyTail.pre;
        dummyTail.pre.next = node;
        node.next = dummyTail;
        dummyTail.pre = node;
    }

    private void removeNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private int removeLast() {
        Node last = dummyTail.pre;
        removeNode(last);
        return last.key;
    }

    private class Node {
        int key;
        int value;
        Node next;
        Node pre;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.map.keySet());

        int res1 = cache.get(1);
        System.out.println(res1);

        cache.put(3, 3);

        int res2 = cache.get(2);
        System.out.println(res2);

        int res3 = cache.get(3);
        System.out.println(res3);

        cache.put(4, 4);
        System.out.println(cache.map.keySet());

        int res4 = cache.get(1);
        System.out.println(res4);

        int res5 = cache.get(3);
        System.out.println(res5);

        int res6 = cache.get(4);
        System.out.println(res6);
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */