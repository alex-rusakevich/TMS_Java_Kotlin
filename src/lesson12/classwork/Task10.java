package lesson12.classwork;

import java.util.HashMap;

/*
* Задача 10: Подсчет частоты символов в строке (без регистра)
  Подсчитать частоту символов в строке.
* */
public class Task10 {
    public static HashMap<Character, Integer> getCharFreq(String in) {
        in = in.toLowerCase();
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char c : in.toCharArray()) {
            if(freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        System.out.println(
                getCharFreq("Hello, World!")
        );
    }
}
