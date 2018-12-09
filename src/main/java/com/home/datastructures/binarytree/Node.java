package com.home.datastructures.binarytree;

public class Node<T> {

    private Integer key;
    private T value;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node(Integer key, T value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return this.key;
    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "  " + key + "  ";
    }
}
