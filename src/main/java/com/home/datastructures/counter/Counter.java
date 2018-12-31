package com.home.datastructures.counter;

public class Counter {

    private String string;
    private int counter = 0;

    public Counter(String string) {
        this.string = string;
    }

    public void increment(){
        this.counter++;
    }

    public int getCounter(){
        return this.counter;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "string='" + string + '\'' +
                ", counter=" + counter +
                '}';
    }
}
