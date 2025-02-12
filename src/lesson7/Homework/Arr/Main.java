package lesson7.Homework.Arr;

import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static void task1() {
        System.out.println("Задание 1");

        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int targetSum = 10;

        System.out.println(Arrays.toString(numbers));
        System.out.println(targetSum);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.printf("%d + %d = %d\n", numbers[i], numbers[j], targetSum);
                }
            }
        }

        System.out.println();
    }

    private static void task2() {
        System.out.println("Задание 2");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 0, 0, 3, 5, 0, 7, 8, 9));

        System.out.println(numbers);

        for(int i=numbers.size()-1; i>=0; i--) {
            if(numbers.get(i) == 0) {
                numbers.remove(i);
                numbers.add(0);
            }
        }

        System.out.println(numbers);

        System.out.println();
    }

    private static void task3() {
        System.out.println("Задание 3");

        int[] numbers1 = {2, 4, 3, 5, 7, 8, 9};
        int[] numbers2 = {9, 4, 3, 5, 7, 8, 2};

        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        numbers1 = Arrays.stream(numbers1).sorted().toArray();
        numbers2 = Arrays.stream(numbers2).sorted().toArray();

        System.out.printf("Это массивы-перестановки? %b\n", Arrays.equals(numbers1, numbers2));

        System.out.println();
    }

    private static void task4() {
        System.out.println("Задание 4");

        List<Integer> numbers = Arrays.asList(4, 3, 5, 7, 8, 9);
        int k = 2;

        System.out.println(numbers);
        System.out.println(k);

        numbers = numbers.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(numbers.subList(0, k));

        System.out.println();
    }

    private static void task5() {
        System.out.println("Задание 5");

        // Pardonne-moi, условие я не понял

        System.out.println();
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
}
