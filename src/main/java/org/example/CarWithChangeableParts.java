package org.example;

public class CarWithChangeableParts {
    private final Engine engine;
    private final Gearbox gearbox;

    public CarWithChangeableParts(Engine engine, Gearbox gearbox) {
        this.engine = engine;
        this.gearbox = gearbox;
    }

    void startEngine(){
        engine.start();
    }

    void shiftGear(){
        gearbox.shiftGear();
    }

}
