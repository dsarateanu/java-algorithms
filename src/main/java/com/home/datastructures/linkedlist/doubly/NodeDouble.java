package com.home.datastructures.linkedlist.doubly;

import java.util.Objects;

public class NodeDouble<T> {

    private T value;
    private NodeDouble<T> next = null;
    private NodeDouble<T> previous = null;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeDouble<T> getNext() {
        return next;
    }

    public void setNext(NodeDouble<T> next) {
        this.next = next;
    }

    public NodeDouble<T> getPrevious() {
        return previous;
    }

    public void setPrevious(NodeDouble<T> previous) {
        this.previous = previous;
    }

    public void displayNode() {
        System.out.print("NodeDouble{value=" + value + '}');
    }
}
