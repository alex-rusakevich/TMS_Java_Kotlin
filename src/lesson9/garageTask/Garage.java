package lesson9.garageTask;

import lesson9.garageTask.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void startAll() {
        for(Vehicle v : vehicles) {
            v.start();
        }
    }

    public void stopAll() {
        for(Vehicle v : vehicles) {
            v.stop();
        }
    }

    public void displayInfo() {
        for(Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
