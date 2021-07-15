package oop.Polymorphism;

/**
 * @author by yorua
 * @classname Node
 * @description TODO
 * @date 2021/1/6 9:29 上午
 */

public class Node {
    int key;
    Integer id;
    Object value;
    Node left;
    Node right;
    Node parent;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
