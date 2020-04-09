package PracticeQuestion.SelectionSort;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        int[] array = {23, 2, 5, 43, 21, 11, 1};
        MySelectionSort mySelectionSort = new MySelectionSort();
        System.out.println("unsorted Arrary-----" + Arrays.toString(array));
        mySelectionSort.SelectionSort(array);
        System.out.println("sorted Arrary-----" + Arrays.toString(array));
    }
}
