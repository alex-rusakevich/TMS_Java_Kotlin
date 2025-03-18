package lesson15.homework;

import java.util.concurrent.CyclicBarrier;

/*
* Задача 6: Синхронизация группы потоков
Реализуй программу, где 3 потока выполняют работу и ждут друг друга на
CyclicBarrier. Когда все потоки достигли барьера, они продолжают выполнение.
* */
public class Task6 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("Все потоки достигли барьера, продолжаем выполнение");
        });

        for(int i=0; i<3; i++)
            new Thread(() -> {
                String threadName = Thread.currentThread().getName();

                try {
                    System.out.println("Поток " + threadName + " выполняет работу");
                    Thread.sleep((long) (Math.random() * 1000));
                    System.out.println("Поток " + threadName + " достиг барьера");
                    barrier.await();
                    System.out.println("Поток " + threadName + " продолжает выполнение после барьера");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
    }
}
