package com.home.algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.home.algorithms.sort.InsertionSort.insertionSort;
import static com.home.algorithms.sort.MergeSort.mergeSort;
import static com.home.algorithms.sort.SelectionSort.selectionSort;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(25, 47, 3, 19, 8, 18, 99, 81, 5);
        System.out.println(integers);
        System.out.println("Selection sort: ");
        System.out.println(selectionSort(integers).toString());
        System.out.println("Insertion sort: ");
        System.out.println(insertionSort(integers).toString());
        System.out.println("Merge sort: ");
        List<Integer> mergeSortIntegers = new ArrayList<>(integers);
        mergeSort(mergeSortIntegers, 0, integers.size()-1);
        System.out.println(mergeSortIntegers);
        System.out.println("Quick sort: ");
        List<Integer> quickSortIntegers = new ArrayList<>(integers);
        mergeSort(quickSortIntegers, 0, integers.size()-1);
        System.out.println(quickSortIntegers);
    }
}
