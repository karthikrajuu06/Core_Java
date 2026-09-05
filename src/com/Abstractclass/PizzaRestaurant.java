package com.Abstractclass;

class PizzaRestaurant extends Restaurant {

    PizzaRestaurant(String name, String location) {
        super(name, location);
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing pizza with cheese and toppings");
    }
}
