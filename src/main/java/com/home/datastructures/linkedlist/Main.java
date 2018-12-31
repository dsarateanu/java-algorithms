package com.home.datastructures.linkedlist;

import com.home.datastructures.linkedlist.circular.CircularLinkedList;
import com.home.datastructures.linkedlist.doubly.DoublyLinkedList;
import com.home.datastructures.linkedlist.simple.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        // SinglyLinkedList
        SinglyLinkedList<Character> linkedList = new SinglyLinkedList<Character>();
        linkedList.insertFirst('a');
        linkedList.insertFirst('b');
        linkedList.insertFirst('c');
        linkedList.insertFirst('d');
        linkedList.insertFirst('e');
        linkedList.insertFirst('f');
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.insertLast('F');

        System.out.println(linkedList.toString());
        System.out.println();

        // CircularLinkedList
        CircularLinkedList<Character> circularLinkedList = new CircularLinkedList<Character>();
        circularLinkedList.insertFirst('a');
        circularLinkedList.insertFirst('b');
        circularLinkedList.insertFirst('c');
        circularLinkedList.insertFirst('d');
        circularLinkedList.insertFirst('e');
        circularLinkedList.insertFirst('f');
        circularLinkedList.deleteFirst();
        circularLinkedList.deleteFirst();
        circularLinkedList.insertLast('F');

        System.out.println(linkedList.toString());
        System.out.println();

        // DoublyLinkedList
        DoublyLinkedList<Character> doublyLinkedList = new DoublyLinkedList<Character>();
        doublyLinkedList.insertFirst('a');
        doublyLinkedList.insertFirst('b');
        doublyLinkedList.insertFirst('c');
        doublyLinkedList.insertFirst('d');
        doublyLinkedList.displayForward();
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteLast();
        doublyLinkedList.insertFirst('y');
        doublyLinkedList.insertLast('z');
        doublyLinkedList.displayForward();
        doublyLinkedList.insertAfter('b','i');
        doublyLinkedList.displayForward();
        doublyLinkedList.deleteKey('i');
        doublyLinkedList.displayForward();
    }
}
