package com.home.algorithms.sort;

import java.util.List;

public class QuickSort {

    public static void quickSort(List<Integer> integers, Integer start, Integer end) {
        if (start < end) {
            int middle = partition(integers, start, end);
            quickSort(integers, start, middle - 1);
            quickSort(integers, middle + 1, end);
        }
    }

    private static int partition(List<Integer> integers, Integer start, Integer end) {
        int i = start - 1;
        int pivot = integers.get(end);

        for(int j = start; j < end-1; j++){
            if(integers.get(j) <= pivot){
                i++;
                integers.set(i, integers.get(j));
            }
        }
        integers.set(i+1, integers.get(end));
        return i+1;
    }
}
