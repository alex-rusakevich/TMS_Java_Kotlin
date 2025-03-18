package lesson14.homework;

import java.util.concurrent.atomic.AtomicInteger;

/*
* Задача 2: Применение атомарных типов для безопасного увеличения счетчика
Описание: Напишите программу, в которой два потока одновременно увеличивают
счетчик. Вместо синхронизации используйте класс AtomicInteger, чтобы избежать
блокировок.
* */
public class Task2 {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for(int i=0;i<100;i++) {
                counter.set(counter.get() + 1);
                System.out.println(Thread.currentThread().getName() + " " + counter);
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i=0;i<100;i++) {
                counter.set(counter.get() + 1);
                System.out.println(Thread.currentThread().getName() + " " + counter);
            }
        });

        thread1.start();
        thread2.start();
    }
}
