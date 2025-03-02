package lesson12.classwork;

import java.util.Arrays;
import java.util.HashSet;

/*
* Задача 8: Проверка, является ли одно множество подмножеством другого
  Проверить, является ли set1 подмножеством set2.
* */
public class Task8 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5));

        System.out.printf("Set 1 is a subest of set 2? %b", set2.containsAll(set1));
    }
}
