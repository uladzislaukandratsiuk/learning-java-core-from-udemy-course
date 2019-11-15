package com.challenge.polymorphism;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return "(default) Engine started";
    }

    public String accelerate() {
        return "(default) Car accelerate";
    }

    public String brake() {
        return "(default) Car stops";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Ford extends Car {

    public Ford() {
        super("Ford Focus", 4);
    }

    @Override
    public String startEngine() {
        return "Ford Focus Engine started";
    }

    @Override
    public String accelerate() {
        return "Ford Focus Car accelerate";
    }

    @Override
    public String brake() {
        return "Ford Focus Car stops";
    }
}

class Bmw extends Car {

    public Bmw() {
        super("Bmw m3", 4);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Engine started";    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return "Bmw m3 Car stops";
    }
}

class Geely extends Car {

    public Geely() {
        super("Geely atlas", 4);
    }
}

public class Main {

    public static void main(String[] args) {

        for (int carNumber = 1; carNumber <= 3; carNumber++) {
            Car car = testCar(carNumber);
            System.out.println("Test car #" + carNumber + " : " + car.getName() + "\n"
                    + car.startEngine() + "\n" + car.accelerate() + "\n" + car.brake() + "\n");
        }
    }

    public static Car testCar(int carNumber) {

        switch (carNumber) {
            case 1:
                return new Ford();

            case 2:
                return new Bmw();

            case 3:
                return new Geely();
        }

        return null;
    }
}
