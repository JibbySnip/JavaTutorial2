package com.finnbrenner.JavaTutorial;

public class Car {
    private String brand; // an attribute of car
    private String model;
    private int age;
    private int cost;
    private int sale = 1000;
    private static final int numWheels = 4;

    public static void main(String[] args) {
        Car myCar1 = new Car("Honda", "Civic", 15000);
        System.out.println(myCar1);
        Car myCar2 = new Car("Honda", "Civic", 5, 12500);
        System.out.println(myCar2);
        myCar1.age();
        myCar1.setAge(6);
    }

    public Car(String brand, String model, int cost) {
        this.brand = brand;
        this.model = model;
        age = 0;
        this.cost = cost;
    }

    public Car(String brand, String model, int age, int cost) {
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "A " + age + " year old " + brand + " " + model;
    }

    public void age() { // method of Car class
        age++;
    }

    public int getAge() { // method of the Car class
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getCost() {
        return cost-sale;
    }
}
