package lesson12.classwork;

import java.util.HashMap;
import java.util.List;

/*
* Задача 9: Найти дубликаты в списке и их количество
  Найти дубликаты и их количество.
* */
public class Task9 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> dups = new HashMap<>();
        List<Integer> numbers = List.of(1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5);

        for(Integer number : numbers) {
            if(dups.containsKey(number)) {
                dups.put(number, dups.get(number) + 1);
            } else {
                dups.put(number, 1);
            }
        }

        System.out.println(dups);
    }
}
