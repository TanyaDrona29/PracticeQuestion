package PracticeQuestion.LinearSearch;

import java.util.Scanner;

public class MainLinearSearch {
    public static void main(String[] args) {
        MyLinearSearch myLinearSearch = new MyLinearSearch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the element you want in  the array");
        int num = scanner.nextInt();
        int arr[] = new int[num];
        System.out.println("enter all the elements");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array is-");
        for (int element : arr) {
            System.out.print(element + " ");
            System.out.println();
        }
        System.out.println("enter the element to be searched for");
        int x = scanner.nextInt();
        int result = myLinearSearch.search(arr, x);
        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("element found at index" + result);
        }
    }
}
