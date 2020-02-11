package PracticeQuestion.Question1;

public class Solution {
    public static void arrangeString(String string, int x, int y) {
        int countOf_0 = 0;
        int countOf_1 = 0;
        int length = string.length();
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) == 1) {
                countOf_1++;
            } else {
                countOf_0++;
            }
        }
        while (countOf_0 > 0 || countOf_1 > 0) {
            for (int j = 0; j < x && countOf_0 > 0; j++) {
                if (countOf_0 > 0) {
                    System.out.print("0");
                    countOf_0--;
                }
            }
            for (int k = 0; k < y && countOf_1 > 0; k++) {
                if (countOf_1 > 0) {
                    System.out.print("1");
                    countOf_1--;
                }
            }
        }
    }
}
