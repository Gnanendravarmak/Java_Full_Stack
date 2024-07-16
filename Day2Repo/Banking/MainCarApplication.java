package com.grayMatter.banking;

public class MainCarApplication {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", "V6");

        car.startCar();
        System.out.println("Car Engine Type: " + car.getEngine().getType());
        car.stopCar();
    }
}

