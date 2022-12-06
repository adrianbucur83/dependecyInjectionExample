package org.example;

public class ElectricGearbox implements Gearbox{
    @Override
    public void shiftGear() {
        System.out.println("No need to shift gears");
    }
}
