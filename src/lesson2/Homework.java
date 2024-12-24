package lesson2;

import java.util.Scanner;

public class Homework {
    private static final Scanner scanner = new Scanner(System.in);

    public static void excercise1() {
        System.out.println("Упражнение 1");

        int width = scanner.nextInt(), height = scanner.nextInt();

        System.out.printf("Периметр: %d, площадь: %d\n",
                2 * (width + height),
                width * height
        );

        System.out.println();
    }

    public static void excercise2() {
        System.out.println("Упражнение 2");

        int points = scanner.nextInt();

        if (points > 100 || points < 0) {
            System.out.println("Число не может быть больше 100 или меньше 0");
        }

        char mark;

        if (points >= 0 && points <= 29) {
            mark = 'F';
        } else if (points >= 30 && points <= 49) {
            mark = 'D';
        } else if (points >= 50 && points <= 74) {
            mark = 'C';
        } else if (points >= 75 && points <= 89) {
            mark = 'B';
        } else {
            mark = 'A';
        }

        System.out.printf("Оценка: %c\n", mark);

        System.out.println();
    }

    public static void excercise3() {
        System.out.println("Упражнение 3");

        int n = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        excercise1();
        excercise2();
        excercise3();
    }
}
