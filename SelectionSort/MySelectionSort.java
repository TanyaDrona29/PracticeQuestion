package PracticeQuestion.SelectionSort;

public class MySelectionSort {
    public void SelectionSort(int[] arrary) {
        int maxElement;
        int elementIndex;
        int sortedIndex = arrary.length;
        for (int i = 0; i < arrary.length; i++) {
            maxElement = arrary[0];
            elementIndex = 0;
            for (int j = 0; j < sortedIndex; j++) {
                if (arrary[j] > maxElement) {
                    maxElement = arrary[j];
                    elementIndex = j;
                }
            }
            int temp = arrary[elementIndex];
            sortedIndex--;
            arrary[elementIndex] = arrary[sortedIndex];
            arrary[sortedIndex] = temp;
        }
    }
}
