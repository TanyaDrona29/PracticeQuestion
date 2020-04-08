package PracticeQuestion.BubbleSort;

import java.util.Arrays;

public class MyBubbleSort {
    public void bubbleSort(int[] arrary) {
        for (int i = 0; i < arrary.length - 1; i++) {
            boolean isSawp = true;
            for (int j = 0; j < arrary.length - 1 - i; j++) {
                if (arrary[j] > arrary[j + 1]) {
                    int temp = arrary[j];
                    arrary[j] = arrary[j + 1];
                    arrary[j + 1] = temp;
                    isSawp = false;
                }
                System.out.println(Arrays.toString(arrary));
            }
            if (isSawp) {
                break;
            }
            System.out.println(Arrays.toString(arrary));
        }
    }
}
