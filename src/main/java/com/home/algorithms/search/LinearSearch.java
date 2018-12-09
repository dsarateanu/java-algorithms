package com.home.algorithms.search;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class LinearSearch<T> {

    private int linearSearch(T[] a, T b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(b)) {
                return i;
            }
        }
        return -1;
    }

    private int linearSearchRecursive(T[] a, int i, T b) {
        if(i > a.length){
            return -1;
        }
        if(a[i] == b){
            return i;
        } else {
            return linearSearchRecursive(a, i+1, b);
        }
    }

    public static void main(String[] args) {
        Character[] characters = ArrayUtils.toObject("abcdefghijklmnopqrstuvwxyz".toCharArray());
        Character searchedCharacter = 'r';
        LinearSearch<Character> linearSearch = new LinearSearch<>();

        System.out.println(linearSearch.displayValues(characters, searchedCharacter));
        System.out.println("Index: " + linearSearch.linearSearch(characters, searchedCharacter));
        System.out.println("Index(Recursive): " + linearSearch.linearSearch(characters, searchedCharacter));
    }

    public String displayValues(Character[] characters, Character searchedCharacter) {
        return "LinearSearch{" +
                "characters=" + Arrays.toString(characters) +
                ", searchedCharacter=" + searchedCharacter +
                '}';
    }
}
