package com.home.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static List<Integer> insertionSort(List<Integer> integers) {
        List<Integer> sortedIntegers = new ArrayList<>(integers);
        for (int i = 1; i < sortedIntegers.size(); i++) {
            Integer element = sortedIntegers.get(i);
            int j = i - 1;
            while (j >= 0 && sortedIntegers.get(j) > element) {
                sortedIntegers.set(j + 1, sortedIntegers.get(j));
                j--;
            }
            sortedIntegers.set(j + 1, element);
        }

        return sortedIntegers;
    }
}
