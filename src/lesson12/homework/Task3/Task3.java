package lesson12.homework.Task3;

import java.util.HashSet;

/*
*   Задача 3*: Поиск всех пар чисел, сумма которых равна заданному числу
    Дан массив чисел и целевое значение target. Нужно найти все пары чисел, сумма
    которых равна target.
* */
public class Task3 {
    private static HashSet<OrderedIntPair> findPairsWithSumOf(int[] numbers, int sum) {
        HashSet<OrderedIntPair> pairs = new HashSet<>();

        for(int i=0; i<numbers.length; i++)
            for(int k=(i+1); k < numbers.length; k++) {
                if (numbers[i] + numbers[k] == sum)
                    pairs.add(new OrderedIntPair(numbers[i], numbers[k]));
            }

        return pairs;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(findPairsWithSumOf(numbers, 9));
    }
}
