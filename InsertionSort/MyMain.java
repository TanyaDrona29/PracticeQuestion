package PracticeQuestion.InsertionSort;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        int[] arr = {25, 2, 8, 60, 3};
        System.out.println("Unsorted -->" + Arrays.toString(arr));
        MyInsertionSort myInsertionSort = new MyInsertionSort();
        myInsertionSort.insesrtionSort(arr);
        System.out.println("Sorted-->" + Arrays.toString(arr));
    }
}
