package com.home.datastructures.linkedlist.simple;

import com.home.datastructures.linkedlist.Node;

/**
 * Unidirectional linked list
 *
 * @param <T>
 */
public class SinglyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    public void insertFirst(T data) {
        Node<T> node = new Node<T>();
        node.setValue(data);
        node.setNext(this.first);
        this.first = node;
    }

    public void insertLast(T data) {
        Node<T> current = this.first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        Node<T> node = new Node<T>();
        node.setValue(data);
        current.setNext(node);
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.getNext();
        return temp;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "first=" + first +
                '}';
    }
}
