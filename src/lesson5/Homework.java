package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    static Scanner scanner = new Scanner(System.in);

    private static void task1(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Cannot find min and max for an empty array.");
            return;
        }

        int min, min_index, max, max_index;

        min = arr[0];
        min_index = 0;

        max = arr[0];
        max_index = 0;

        for(int i=1; i< arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                min_index = i;
            }

            if(arr[i] > max) {
                max = arr[i];
                max_index = i;
            }
        }

        System.out.printf("Max value: %d, index: %d\n", max, max_index);
        System.out.printf("Min value: %d, index: %d\n\n", min, min_index);
    }

    private static void task2(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Cannot find evens and odds for an empty array.");
            return;
        }

        int count_evens = 0, count_odds = 0;

        for (int j : arr) {
            if (j % 2 == 0) {
                count_evens++;
            } else {
                count_odds++;
            }
        }

        System.out.printf("Evens: %d, odds: %d\n\n", count_evens, count_odds);
    }

    private static void task3(int[] arr) {
        int temp;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.printf("Reversed: %s\n\n", Arrays.toString(arr));
    }

    private static void task4(int[] arr) {
        boolean isPalindrome = true;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.printf("Is the array a palindrome? %b!\n\n", isPalindrome);
    }

    public static void main(String[] args) {
        int arrSize;

        System.out.print("Your array's size: ");
        arrSize = scanner.nextInt();

        int[] arr = new int[arrSize];

        System.out.printf("Enter %d numbers: ", arrSize);

        for(int i=0; i<arrSize; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println();

        task1(arr);
        task2(arr);
        task3(arr);
        task4(arr);
    }
}
