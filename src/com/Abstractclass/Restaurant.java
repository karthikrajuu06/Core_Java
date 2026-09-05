package com.Abstractclass;

abstract class Restaurant {

    String name;
    String location;

    Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void displayDetails() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Location: " + location);
    }

    void receiveOrder() {
        System.out.println("Order received successfully");
    }

    abstract void prepareFood();
}
