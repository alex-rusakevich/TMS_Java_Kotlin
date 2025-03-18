package lesson14.homework;

/*
* Задача 3: Синхронизация потоков для предотвращения гонки данных
Описание: Напишите программу с двумя потоками, которые одновременно
увеличивают и уменьшают значение счетчика. Ваша задача — обеспечить, чтобы
операция увеличения и уменьшения была выполнена безопасно с помощью
синхронизации.
* */
public class Task3 {
    public static void main(String[] args) {
        IncDec counter = new IncDec();

        Thread thread1 = new Thread(() -> {
            for(int i=0; i<100; i++) {
                counter.increment();
                System.out.println(Thread.currentThread().getName() + " " + counter.value);
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i=0; i<100; i++) {
                counter.decrement();
                System.out.println(Thread.currentThread().getName() + " " + counter.value);
            }
        });

        thread1.start();
        thread2.start();
    }
}

class IncDec {
    public int value = 0;

    public synchronized void increment() {
        value++;
    }

    public synchronized void decrement() {
        value--;
    }
}
