package PracticeQuestion.InsertionSort;

public class MyInsertionSort {

    public void insesrtionSort(int[] arrary) {
        for (int i = 0; i < arrary.length; i++) {
            int next = arrary[i];
            System.out.println(next);
            for (int j = i; j > 0; j--) {
                if (arrary[j] > arrary[j - 1]) {
                    System.out.println("Exchange" + arrary[j] + "and" + arrary[j - 1]);
                    int temp = arrary[j];
                    arrary[j] = arrary[j - 1];
                    arrary[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
