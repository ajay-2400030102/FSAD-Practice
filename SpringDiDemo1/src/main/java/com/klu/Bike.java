package com.klu;

public class Bike {

    private Engine engine;

    // Setter Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void ride() {
        engine.start();
        System.out.println("Initiated Bike ride...");
    }
}