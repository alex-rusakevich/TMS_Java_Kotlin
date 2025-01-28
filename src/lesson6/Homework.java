package lesson6;

import java.util.*;

public class Homework {
    private static final Scanner scanner = new Scanner(System.in);

    private static int[] bubbleSort(int[] arr) {
        int swap;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]) {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }

        return arr;
    }

    private static void task1NegativeArrSort(int[] arr) {
//        Отсортируйте массив, чтобы отрицательные числа находились перед
//        положительными

        System.out.printf("Отсортированный по возрастанию: %s\n", Arrays.toString(bubbleSort(arr)));
    }

    private static void task2FreqSort(int[] arr) {
//        Напишите функцию, которая сортирует массив по частоте появления элементов (по
//        убыванию).
//        Если два элемента встречаются одинаковое количество раз, сортируйте их по
//        возрастанию.
//                Пример:
//        Вход: [4, 5, 6, 5, 4, 3].
//        Выход: [4, 4, 5, 5, 6, 3].

        // Подсчет частоты появления каждого элемента
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Создание массива пар число + частота
        int n = arr.length;
        int[][] frequencyArray = new int[n][2];
        for (int i = 0; i < n; i++) {
            frequencyArray[i][0] = arr[i]; // число
            frequencyArray[i][1] = frequencyMap.get(arr[i]); // частота
        }

        // Пузырьковая сортировка по частоте и значению
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Сравниваем по частоте
                if (frequencyArray[j][1] < frequencyArray[j + 1][1] ||
                        (frequencyArray[j][1] == frequencyArray[j + 1][1] && frequencyArray[j][0] > frequencyArray[j + 1][0])) {
                    // Меняем местами
                    int[] temp = frequencyArray[j];
                    frequencyArray[j] = frequencyArray[j + 1];
                    frequencyArray[j + 1] = temp;
                }
            }
        }

        // Заполнение отсортированного массива
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = frequencyArray[i][0];
        }

        System.out.printf("Отсортировано по частоте: %s\n", Arrays.toString(result));
    }

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        System.out.print("Введите числа массива: ");
        for(int i=0; i<arrSize; i++) {
            arr[i] = scanner.nextInt();
        }

        task1NegativeArrSort(arr);
        task2FreqSort(arr);
    }
}
