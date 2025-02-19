package lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*
    Задача 1:Деление с обработкой исключения
    Задача: Написать программу, которая делит два числа, введенных пользователем.
    Обработать:
    ArithmeticException (деление на ноль).
    InputMismatchException (если введено не число).
    */
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        System.out.print("/: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        try {
            System.out.printf("%d / %d = %d", n1, n2, n1 / n2);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (InputMismatchException e) {
            System.out.println("Неправильный ввод: ожидалось число");
        }
    }

    /*
    Задача 2: Проверка возраста (кастомное исключение)
    Задача: Попросить пользователя ввести возраст. Если возраст < 18, выбросить
    исключение.
    Используем кастомное исключение TooYoungException.
    */
    public static void task2() throws TooYoungException {
        int age;
        System.out.print("Ваш возраст: ");
        Scanner scanner = new Scanner(System.in);

        age = scanner.nextInt();

        if (age < 18) {
            throw new TooYoungException();
        }
    }

    /*
    Задача 3: Обработка пустой строки
    Задача: Запросить у пользователя строку и проверить, что она не пустая.
    Обработать:
    IllegalArgumentException, если строка пустая.
    */
    public static void task3() {
        String line;
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);

        try {
            line = scanner.nextLine();

            if(line.isEmpty()) {
                throw new StringIsEmptyException("Строка не может быть пустой");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Была введена пустая линия");
        }
    }

    public static void main(String[] args) {
        task1();

        try {
            task2();
        } catch (TooYoungException e) {
            e.printStackTrace();
        }

        try {
            task3();
        } catch (StringIsEmptyException e) {
            e.printStackTrace();
        }
    }
}
