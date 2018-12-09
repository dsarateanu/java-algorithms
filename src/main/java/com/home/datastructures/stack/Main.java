package com.home.datastructures.stack;

public class Main {

    public static void main(String[] args) {

        Stack<Long> stack = new Stack(3);

        stack.push(1L);
        stack.push(2L);
        stack.push(3L);
        System.out.println(stack.peak());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peak());

        System.out.println();
        System.out.println(reverseString("Apaminerala"));
    }

    private static String reverseString(String str){
        int stackSize = str.length();
        Stack<Character> stack = new Stack(stackSize);
        for(int i = 0; i < stackSize; i++){
            stack.push(str.charAt(i));
        }
        String reverseString = "";
        while (!stack.isEmpty()){
            reverseString += stack.pop();
        }
        return reverseString;
    }
}
