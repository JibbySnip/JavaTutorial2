package com.finnbrenner.JavaTutorial;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private int money;
    private ArrayList<Car> cars = new ArrayList<>();

    public Person(String firstName, String lastName, int age, int money) {
        this.name = firstName + " " + lastName;
        this.age = age;
        this.money = money;
    }

    public static void main(String[] args) {
        Person myPerson = new Person("John", "Doe", 32, 60000);
        Car car = new Car("Nissan", "Leaf", 20000);
        Car car2 = new Car("Nissan", "Leaf", 50000);

        myPerson.buyCar(car);
        myPerson.buyCar(car2);

        for (Car myCar : myPerson.cars) {
            System.out.println(myCar);
        }
    }

    public void buyCar(Car carToBuy) {
        if (carToBuy.getCost() <= money) {
            cars.add(carToBuy);
            money -= carToBuy.getCost();
        }
    }
}
