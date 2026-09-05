package com.Abstractclass;

class BiryaniRestaurant extends Restaurant {

    BiryaniRestaurant(String name, String location) {
        super(name, location);
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing biryani with rice and spices");
    }
}