package lesson15;

import java.util.concurrent.locks.ReentrantLock;

/*
* Задача 3: Защита ресурса
Создай класс SharedResource, к которому могут обращаться несколько потоков.
* Используй ReentrantLock, чтобы предотвратить одновременный доступ.
* */
public class Task3 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(sharedResource::access);
        Thread thread2 = new Thread(sharedResource::access);

        thread1.start();
        thread2.start();
    }
}

class SharedResource {
    private final ReentrantLock lock = new ReentrantLock();

    public void access() {
        lock.lock();

        System.out.println(Thread.currentThread().getName() + " asked for cats.png, waiting...");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("OK");

        lock.unlock();
    }
}
