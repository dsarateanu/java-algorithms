package com.home.datastructures.queue;

public class Main {

    public static void main(String[] args) {
        System.out.println(displayChars("DanieSarateanu"));
    }

    private static String displayChars(String str) {
        int stackSize = str.length();
        Queue<Character> queue = new Queue(stackSize);
        for (int i = 0; i < stackSize; i++) {
            queue.insert(str.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString += queue.remove();
        }
        return reverseString;
    }
}
