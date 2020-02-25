package PracticeQuestion.Question3;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println("enter total number of customers");
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int[] times = new int[total];
        String[] name = new String[total];
        for (int i = 0; i < total; i++) {                        //getting values in arary
            System.out.println("enter details");
            times[i] = scanner.nextInt();
            name[i] = scanner.nextLine();
        }
        for (int i = 0; i < total; i++) {                       //printing arrary
            System.out.print(times[i]);
            System.out.println(name[i]);
        }
        int max = 0;
        for (int i = 0; i < total; i++) {
            if (max < times[i]) {
                max = times[i];
            }
            //System.out.println(max);
        }
        for (int i = 0; i < total; i++) {
            if (max == times[i]) {
                System.out.println(max + name[i]);
            }
        }
    }
}
