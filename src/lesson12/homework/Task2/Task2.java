package lesson12.homework.Task2;

import java.util.HashSet;
import java.util.List;

/*
* Задача 2: Поиск первого повторяющегося числа
  Дан список чисел, нужно найти первое число, которое повторяется.
* */
public class Task2 {
    public static int firstRepetative(List<Integer> listIn) {
        HashSet<Integer> numberSet = new HashSet<>();

        for(Integer number : listIn) {
            if(numberSet.contains(number)) {
                return number;
            } else {
                numberSet.add(number);
            }
        }

        throw new UnexpectedUniqueListException("The list cannot be unique");
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        System.out.println(firstRepetative(numbers));
    }
}
