package com.home.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static List<Integer> selectionSort(List<Integer> integers) {
        List<Integer> sortedIntegers = new ArrayList<>(integers);
        for (int i = 0; i < sortedIntegers.size(); i++) {
            Integer minimum = i;
            for (int j = i + 1; j < sortedIntegers.size(); j++) {
                if (sortedIntegers.get(minimum) > sortedIntegers.get(j)) {
                    minimum = j;
                }
            }
            Integer aux = sortedIntegers.get(i);
            sortedIntegers.set(i, sortedIntegers.get(minimum));
            sortedIntegers.set(minimum, aux);
        }
        return sortedIntegers;
    }

}
