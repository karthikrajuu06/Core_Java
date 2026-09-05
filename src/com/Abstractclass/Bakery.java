package com.Abstractclass;

class Bakery extends Restaurant {

    Bakery(String name, String location) {
        super(name, location);
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing fresh cakes and bread");
    }
}
