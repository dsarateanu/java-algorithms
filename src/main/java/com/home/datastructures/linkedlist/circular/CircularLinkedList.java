package com.home.datastructures.linkedlist.circular;

import com.home.datastructures.linkedlist.Node;

public class CircularLinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    public CircularLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(T data) {
        Node<T> node = new Node<T>();
        node.setValue(data);
        if (isEmpty()) {
            this.last = node;
        }
        node.setNext(this.first);
        this.first = node;
    }

    public void insertLast(T data) {
        Node<T> node = new Node<T>();
        node.setValue(data);

        if (isEmpty()) {
            this.first = node;
        } else {
            this.last.setNext(node);
            this.last = node;
        }
    }

    public T deleteFirst() {
        T temp = this.first.getValue();
        if (this.first.getNext() == null) {
            this.last = null;
        }
        this.first = this.first.getNext();
        return temp;
    }

    public boolean isEmpty() {
        return (first == null);
    }
}
