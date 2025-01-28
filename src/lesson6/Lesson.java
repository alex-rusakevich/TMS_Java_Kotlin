package lesson6;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
        /*
        * Отсортируйте массив строк в лексикографическом порядке. Пример:
        Вход: ["apple", "banana", "cherry", "date"].
        Выход: ["apple", "banana", "cherry", "date"].
        * */

        String[] strings = {"date", "cherry", "banana", "apple"};
        String swap;

        for(int i=0; i<strings.length; i++){
            for(int j=i+1; j<strings.length; j++){
                if(strings[i].compareTo(strings[j]) > 0) {
                    swap = strings[i];
                    strings[i] = strings[j];
                    strings[j] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(strings));
    }
}
