package lesson15.homework;

/*
* Задача 1: Синхронизация доступа к счетчику с помощью внешнего объекта
Описание: Вам нужно создать класс Counter, который будет иметь метод increment и
метод decrement. Эти методы должны увеличивать и уменьшать значение переменной
count в многопоточном режиме. Для синхронизации доступов используйте внешний
объект (не объект класса).
* */
public class Task1 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Sync sync = new Sync();

        Thread thread1 = new Thread(() -> {
            for(int i=0; i<100; i++) {
                synchronized (sync) {
                    counter.increment();
                }
                System.out.println(Thread.currentThread().getName() + " " + counter.value);
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i=0; i<100; i++) {
                synchronized (sync) {
                    counter.decrement();
                }
                System.out.println(Thread.currentThread().getName() + " " + counter.value);
            }
        });

        thread1.start();
        thread2.start();
    }
}

class Sync {

}

class Counter {
    public int value = 0;

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }
}
