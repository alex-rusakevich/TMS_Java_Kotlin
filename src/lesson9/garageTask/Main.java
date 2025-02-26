package lesson9.garageTask;

import lesson9.garageTask.Vehicle.Bike;
import lesson9.garageTask.Vehicle.Car;
import lesson9.garageTask.Vehicle.Motorcycle;

/*
Задача 3: Система транспортных средств
Описание: Создайте систему для управления транспортными средствами (машины, велосипеды, мотоциклы). Каждое транспортное средство должно иметь
методы для начала движения и остановки. Также должны быть методы для отображения информации о транспортном средстве.
Требования:
1.
Создайте интерфейс Vehicle, который должен содержать методы:
void start(): начинает движение.
void stop(): останавливает движение.
void displayInfo(): выводит информацию о транспортном средстве.
Создайте три класса, реализующих интерфейс Vehicle:
◦ Класс Car, который имеет свойство brand (марка машины).
◦ Класс Bike, который имеет свойство type (тип велосипеда).
◦ Класс Motorcycle, который имеет свойство engineCapacity (объем двигателя).
Создайте класс Garage, который будет хранить список транспортных средств и предоставлять методы для начала и остановки всех транспортных
средств в гараже.
Создайте метод main, в котором создайте несколько транспортных средств и добавьте их в гараж. Затем вызовите методы для старта и остановки.
 */

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
