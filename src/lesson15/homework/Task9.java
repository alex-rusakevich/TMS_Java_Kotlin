package lesson15.homework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
* Задача 9: Потокобезопасная очередь
Реализуй очередь с BlockingQueue, куда один поток добавляет элементы, а другой
извлекает их с интервалом в 1 секунду.
* */
public class Task9 {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue<Integer>(10);

        Thread thread1 = new Thread(() -> {
            for(int i=0;i<10;i++) {
                try {
                    blockingQueue.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Put");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i=0;i<10;i++) {
                try {
                    blockingQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Take");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
