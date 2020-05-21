package PracticeQuestion.LinearSearch;

public class MyLinearSearch {
    public int search(int arrary[], int element) {
        int n = arrary.length;
        for (int i = 0; i < arrary.length; i++) {
            if (arrary[i] == element)
                return i;
        }
        return -1;
    }
}
