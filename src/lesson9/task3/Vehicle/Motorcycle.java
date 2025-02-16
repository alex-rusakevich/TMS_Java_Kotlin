package lesson9.task3.Vehicle;

public class Motorcycle implements Vehicle {
    private boolean isRunning = false;
    private float engineCapacity = 50;

    public Motorcycle(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public void displayInfo() {
        System.out.printf(
                "Motorcycle with engine capacity of %.2f cm^3, running: %b\n",
                engineCapacity, isRunning
        );
    }
}
