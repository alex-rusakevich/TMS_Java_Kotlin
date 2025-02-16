package lesson9.task3;

import lesson9.task3.Vehicle.Bike;
import lesson9.task3.Vehicle.Car;
import lesson9.task3.Vehicle.Motorcycle;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.addVehicle(new Bike("three-wheel"));
        garage.addVehicle(new Car("The Burning Bear"));
        garage.addVehicle(new Motorcycle(60));

        System.out.println("Initial status");
        garage.displayInfo();
        System.out.println();

        System.out.println("Start all");
        garage.startAll();
        garage.displayInfo();
        System.out.println();

        System.out.println("Stop all");
        garage.stopAll();
        garage.displayInfo();
    }
}
