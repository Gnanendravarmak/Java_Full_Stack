package com.grayMatter.banking;

public class Car {
    private String brand;
    private String model;
    private Engine engine;

    public Car(String brand, String model, String engineType) {
        this.brand = brand;
        this.model = model;
        this.engine = new Engine(engineType);
    }

    public void startCar() {
        System.out.println("Starting the car " + brand + " " + model);
        engine.start();
    }

    public void stopCar() {
        System.out.println("Stopping the car " + brand + " " + model);
        engine.stop();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}

