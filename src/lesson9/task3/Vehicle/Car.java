package lesson9.task3.Vehicle;

public class Car implements Vehicle {
    private final String brand;
    private boolean isRunning = false;

    public Car(String brand) {
        this.brand = brand;
    }

    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public void displayInfo() {
        System.out.printf(
                "Car \"%s\", running: %b\n",
                brand, isRunning
        );
    }
}
