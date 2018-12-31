package com.home.datastructures.stack;

/**
 * Last In First Out
 *
 * @param <T>
 */
public class Stack<T> {

    private int maxSize;
    private T[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public void push(T value) {
        if (!isFull()) {
            this.stackArray[++this.top] = value;
        } else {
            System.out.println("The stack is full");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            int old_top = this.top;
            this.top--;
            return this.stackArray[old_top];
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
            return stackArray[top];
        }
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

}
