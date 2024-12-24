package lesson2;

import java.util.Scanner;

public class Excersies {
    private static final Scanner scanner = new Scanner(System.in);

    public static void excersise1(){
        System.out.println("Задание 1");

        System.out.println(scanner.nextInt() + scanner.nextInt());

        System.out.println();
    }

    public static void excersise2(){
        System.out.println("Задание 2");

        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

        System.out.println();
    }

    public static void excersise3(){
        System.out.println("Задание 3");

        int num = scanner.nextInt();

        for(int i = 1; i < num; i++)
            System.out.print(i + " ");

        System.out.println("\n");
    }

    public static void excersise4(){
        System.out.println("Задание 4");

        int i = 1, sum = 0;
        final int n = scanner.nextInt();

        while (i < n) {
            sum += i;
            i++;
        }

        System.out.println(sum);

        System.out.println();
    }

    public static void excersise5(){
        System.out.println("Задание 5");

        int numberIn;

        do {
            numberIn = scanner.nextInt();
        } while (numberIn >= 0);

        System.out.println();
    }

    public static void main(String[] args) {
        excersise1();
        excersise2();
        excersise3();
        excersise4();
        excersise5();
    }
}
