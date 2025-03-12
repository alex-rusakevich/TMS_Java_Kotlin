package lesson12.homework.Task1;

import java.util.*;

/*
    Задача 1: Группировка анаграмм
    Дан список слов. Нужно сгруппировать слова, которые являются анаграммами.
    {"listen", "silent", "enlist", "java", "avaj", "world"}
*/
public class Task1 {
    public static String sortString(String in) {
        char[] strInChars = in.toCharArray();
        Arrays.sort(strInChars);
        return new String(strInChars);
    }

    private static List<String> groupAnagrams(String[] words) {
        HashMap<String, List<String>> anagramsMap = new HashMap<>();

        for(String word : words) {
            String sortedWord = sortString(word);

            if(anagramsMap.containsKey(sortedWord)) {
                anagramsMap.get(sortedWord).add(word);
            } else {
                List<String> newList = new ArrayList<>(){};
                newList.add(word);
                anagramsMap.put(sortedWord, newList);
            }
        }

        List<String> result = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : anagramsMap.entrySet()) {
            result.addAll(entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> anagrams = groupAnagrams(
                new String[]{"listen", "silent", "dad", "world", "enlist", "java", "avaj", "add"}
        );

        System.out.println(anagrams);
    }
}
