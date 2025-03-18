package lesson15.homework;

/*
* Задача 7: Ограниченный доступ к ресурсу
Создай класс ParkingLot с Semaphore(3), где 5 машин пытаются припарковаться, но
одновременно могут занять только 3 места.
* */
import java.util.concurrent.Semaphore;

class ParkingLot {
    private final Semaphore availableSpots = new Semaphore(3);

    public void parkCar(String carName) {
        try {
            System.out.println(carName + " пытается припарковаться...");
            availableSpots.acquire();
            System.out.println(carName + " припарковался");
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println(carName + " покидает парковку");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            availableSpots.release();
        }
    }
}

public class Task7 {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();

        for (int i = 1; i <= 5; i++) {
            int finalI = i;
            new Thread(() -> {
                parkingLot.parkCar("Машина #" + finalI);
            }).start();
        }
    }
}
