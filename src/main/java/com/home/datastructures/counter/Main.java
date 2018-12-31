package com.home.datastructures.counter;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter("FirstCounter");

        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getCounter());
        System.out.println(counter.toString());
    }
}
