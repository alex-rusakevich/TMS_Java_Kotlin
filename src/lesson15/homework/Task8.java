package lesson15.homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
* Задача 8: Пул потоков
Используй ThreadPoolExecutor для обработки 10 задач, каждая из которых
выполняется 1 секунду.
* */
public class Task8 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                try {
                    System.out.println("Задача " + taskId + " начинается");
                    Thread.sleep(1000);
                    System.out.println("Задача " + taskId + " завершена");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все задачи завершены.");
    }
}
