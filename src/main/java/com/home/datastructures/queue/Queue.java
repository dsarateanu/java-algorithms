package com.home.datastructures.queue;

/**
 * First In First Out
 *
 * @param <T>
 */
public class Queue<T> {

    private int maxSize;
    private T[] queArray;
    private int front;
    private int rear;
    private int itemsNumber;

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = (T[]) new Object[maxSize];
        this.front = 0;
        this.rear = -1;
        this.itemsNumber = 0;
    }

    public void insert(T value) {
        if (!isFull()) {
            this.queArray[++this.rear] = value;
            this.itemsNumber++;
        } else {
            System.out.println("The stack is full");
        }
    }

    public T remove() {
        if (!isEmpty()) {
            T temp = this.queArray[this.front];
            this.front++;
            if(this.front == maxSize){
                this.front = 0;
            }
            this.itemsNumber--;
            return temp;
        } else {
            System.out.println("The stack is empty");
            return null;
        }
    }

    public T peak() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return null;
        } else {
            return queArray[front];
        }
    }

    public boolean isFull() {
        return (itemsNumber == maxSize);
    }

    public boolean isEmpty() {
        return (itemsNumber == 0);
    }

}
