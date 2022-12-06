package org.example;

public class Main {
    public static void main(String[] args) {


        Car myDieselCar = new Car();
        myDieselCar.startEngine();
        myDieselCar.shiftGear("UP");



        CarWithChangeableParts electricCar = new CarWithChangeableParts(new ElectricEngine(), new ElectricGearbox());
        electricCar.startEngine();
        electricCar.shiftGear();

    }



}