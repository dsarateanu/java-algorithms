package com.home.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void mergeSort(List<Integer> integers, Integer start, Integer end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(integers, start, middle);
            mergeSort(integers, middle + 1, end);
            merge(integers, start, middle, end);
        }
    }

    private static void merge(List<Integer> integers, Integer start, int middle, Integer end) {

        Integer sizeLeftArray = middle - start + 1;
        List<Integer> leftArray = new ArrayList<>();
        for (int i = 0; i < sizeLeftArray; ++i)
            leftArray.add(integers.get(start + i));

        Integer sizeRightArray = end - middle;
        List<Integer> rightArray = new ArrayList<>();
        for (int j = 0; j < sizeRightArray; ++j)
            rightArray.add(integers.get(middle + 1 + j));

        int i = 0;
        int j = 0;
        int k = start;

        while (i < sizeLeftArray && j < sizeRightArray) {
            if (leftArray.get(i) <= rightArray.get(j)) {
                integers.set(k, leftArray.get(i));
                i++;
            } else {
                integers.set(k, rightArray.get(j));
                j++;
            }
            k++;
        }

        while (i < sizeLeftArray) {
            integers.set(k, leftArray.get(i));
            i++;
            k++;
        }

        while (j < sizeRightArray) {
            integers.set(k, rightArray.get(j));
            j++;
            k++;
        }
    }

}
