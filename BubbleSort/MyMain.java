package PracticeQuestion.BubbleSort;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        int[] arrary = {50, 4, 89, 32, 1, 21, 12, 54, 7};
        System.out.println("unsorted arary----" + Arrays.toString(arrary));
        MyBubbleSort myBubbleSort = new MyBubbleSort();
        myBubbleSort.bubbleSort(arrary);
        System.out.println("sorted arary----" + Arrays.toString(arrary));
    }
}
