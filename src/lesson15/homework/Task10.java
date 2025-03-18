package lesson15.homework;

import java.util.concurrent.CyclicBarrier;

/*
* Задача 10: Использование CyclicBarrier для синхронизации нескольких потоков.
Есть 4 потока, каждый из которых выполняет часть задачи. Все потоки должны завершить
свои работы, прежде чем главный поток продолжит выполнение. Нужно синхронизировать
потоки так, чтобы они все начинали работать одновременно и завершили выполнение
одновременно.
* */
public class Task10 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(4, () -> {
            System.out.println("Все потоки завершили работу");
        });

        for (int i = 0; i < 4; i++) {
            final int threadId = i;
            new Thread(() -> {
                try {
                    System.out.println("Поток " + threadId + " начал выполнение");
                    Thread.sleep((long) (Math.random() * 1000));
                    System.out.println("Поток " + threadId + " завершил выполнение");
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
