package lesson9.garageTask.Vehicle;

public class Bike implements Vehicle {
    private String type;
    private boolean isRunning = false;

    public Bike(String type) {
        this.type = type;
    }

    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public void displayInfo() {
        System.out.printf(
                "%s bike, running: %b\n",
                type, isRunning
        );
    }
}