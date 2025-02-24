package lesson11;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    private static void task1(){
        LinkedList<String> people = new LinkedList<>(List.of(
            "Володя", "Витя", "Тот самый чел, э-э...",
            "Акакий (шучу, Антон. Или не шучу...)",
            "Дарья", "Дарий", "Антиох", "Птолемей"
        ));
        ListIterator<String> iter = people.listIterator();

        while(people.size() > 1) {
            if(!iter.hasNext()) iter = people.listIterator();
            iter.next();

            if(!iter.hasNext()) iter = people.listIterator();
            String manToSayGoodBye = iter.next();

            System.out.printf("Пока-пока, %s!\n", manToSayGoodBye);

            iter.remove();
        }
    }

    private static void task2(){
        LinkedList<Integer> ll1 = new LinkedList<>(List.of(
                1,3,5
        ));
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(
                2,4,6,7,8
        ));
        LinkedList<Integer> merged = new LinkedList<>();

        ListIterator<Integer> ll1Iter = ll1.listIterator();
        ListIterator<Integer> ll2Iter = ll2.listIterator();

        while(ll1Iter.hasNext() && ll2Iter.hasNext()) {
            Integer val1 = ll1Iter.next();
            Integer val2 = ll2Iter.next();

            if(val1 > val2) {
                merged.add(val2);
                merged.add(val1);
            } else {
                merged.add(val1);
                merged.add(val2);
            }
        }

        while (ll1Iter.hasNext()) {
            Integer val = ll1Iter.next();
            merged.add(val);
        }

        while (ll2Iter.hasNext()) {
            Integer val = ll2Iter.next();
            merged.add(val);
        }

        System.out.println(merged);
    }

    private static void task3(){

    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}
