package PracticeQuestion;

import java.util.Scanner;

public class chatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();
        System.out.println("Enter the word to be searched");
        String word = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (word.charAt(counter) == input.charAt(i)) {
                counter++;
                if (counter == word.length()) {
                    break;
                }
            }
        }
        if (counter == word.length()) {
            System.out.println("the word you were looking for is present in the input string");
        } else {
            System.out.println("the word you were looking for is not present in the input string");
        }
    }
}
