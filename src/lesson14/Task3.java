package lesson14;

/*
* Задача 3: Синхронизация потоков с использованием ключевого слова synchronized
Задание: Создайте два потока, которые одновременно увеличивают значение переменной. Синхронизируйте доступ к этой переменной.
* */

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        CounterByAlexanderRusakevich counterByAlexanderRusakevich = new CounterByAlexanderRusakevich();

        Thread thread1 = new Thread(() -> {
            for(int i=0; i<100; i++) {
                counterByAlexanderRusakevich.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i=0; i<100; i++) {
                counterByAlexanderRusakevich.increment();
            }
        });

        thread1.start();
        thread2.start();
    }
}

class CounterByAlexanderRusakevich {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
        System.out.println(counter + " " + Thread.currentThread().getName());
    }

    public int getCounter() {
        return counter;
    }
}
