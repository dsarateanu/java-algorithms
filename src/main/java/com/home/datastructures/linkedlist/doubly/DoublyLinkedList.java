package com.home.datastructures.linkedlist.doubly;

public class DoublyLinkedList<T> {

    private NodeDouble<T> first;
    private NodeDouble<T> last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(T data) {
        NodeDouble<T> node = new NodeDouble<T>();
        node.setValue(data);
        if (isEmpty()) {
            this.last = node;
        } else {
            first.setPrevious(node);
        }
        node.setNext(this.first);
        this.first = node;
    }

    public void insertLast(T data) {
        NodeDouble<T> node = new NodeDouble<T>();
        node.setValue(data);

        if (isEmpty()) {
            this.first = node;
        } else {
            this.last.setNext(node);
            node.setPrevious(this.last);
        }
        this.last = node;
    }

    public T deleteFirst() {
        T temp = this.first.getValue();
        if (this.first.getNext() == null) {
            this.last = null;
        } else {
            this.first.getNext().setPrevious(null);
        }
        this.first = first.getNext();
        return temp;
    }

    public T deleteLast() {
        T temp = this.last.getValue();
        if (this.first.getNext() == null) {
            this.first = null;
        } else {
            this.last.getPrevious().setNext(null);
        }
        this.last = this.last.getPrevious();
        return temp;
    }

    public boolean insertAfter(T key, T value) {
        NodeDouble<T> currentNode = this.first;

        while (currentNode.getValue() != key) {
            currentNode = currentNode.getNext();
            if (currentNode == null) {
                return false;
            }
        }

        NodeDouble<T> nodeDouble = new NodeDouble<T>();
        nodeDouble.setValue(value);

        if(currentNode == this.last){
            currentNode.setNext(null);
            this.last = nodeDouble;
        } else {
            nodeDouble.setNext(currentNode.getNext());
            currentNode.getNext().setPrevious(nodeDouble);
        }

        nodeDouble.setPrevious(currentNode);
        currentNode.setNext(nodeDouble);
        return true;
    }

    public NodeDouble<T> deleteKey(T key){
        NodeDouble<T> currentNode = this.first;

        while (currentNode.getValue() != key) {
            currentNode = currentNode.getNext();
            if (currentNode == null) {
                return null;
            }
        }

        if(currentNode == this.first){
            this.first = currentNode.getNext();
        } else {
            currentNode.getPrevious().setNext(currentNode.getNext());
        }

        if(currentNode == this.last){
            this.last = currentNode.getPrevious();
        } else {
            currentNode.getNext().setPrevious(currentNode.getPrevious());
        }

        return currentNode;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    public void displayForward(){
        System.out.print("List (first --> last): ");
        NodeDouble<T> current = first; // start from the beginning
        while(current != null){
            current.displayNode(); // call the display method of the node
            current = current.getNext(); // move to the next node
        }
        System.out.println();
    }

    public void displayBackward(){
        System.out.print("List (last --> first): ");
        NodeDouble<T> current = last; // start from the end
        while(current != null){
            current.displayNode();
            current = current.getNext();
        }
        System.out.println();
    }
}
