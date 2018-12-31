package com.home.algorithms.search;

import java.util.Arrays;

/**
 * The data must be sorted
 */
public class BinarySearch {

    private Integer binarySearchIterative(Integer[] a, Integer b) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (b < a[middle]) {
                end = middle - 1;
            }
            if (b > a[middle]) {
                start = middle + 1;
            }
            if (b == a[middle]) {
                return middle;
            }
        }

        return -1;
    }

    private Integer binarySearchRecursive(Integer[] array, Integer search, Integer start, Integer end) {

        int middle = (start + end) / 2;

        if (end < start) {
            return -1;
        }
        if (search < array[middle]) {
            return binarySearchRecursive(array, search, start, middle - 1);
        }
        if (search > array[middle]) {
            return binarySearchRecursive(array, search, middle + 1, end);
        }
        if (search == array[middle]) {
            return middle;
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] integers = {3, 11, 21, 29, 41, 54, 61, 78, 110, 127};
        Integer searchedInt = integers[9];

        BinarySearch linearSearch = new BinarySearch();

        System.out.println(linearSearch.displayValues(integers, searchedInt));
        System.out.println("Index(Iterative): " + linearSearch.binarySearchIterative(integers, searchedInt));
        System.out.println("Index(Recursive): " + linearSearch.binarySearchRecursive(integers, searchedInt, 0, integers.length));
        System.out.println("Index(Java): " + Arrays.binarySearch(integers, searchedInt));
    }

    public String displayValues(Integer[] characters, Integer searchedCharacter) {
        return "LinearSearch{" +
                "characters=" + Arrays.toString(characters) +
                ", searchedCharacter=" + searchedCharacter +
                '}';
    }
}
