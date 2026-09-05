package com.Abstractclass;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant r;

        r = new PizzaRestaurant("Pizza Hub", "Hyderabad");
        
        r.displayDetails();
        r.receiveOrder();
        r.prepareFood();

        System.out.println();

        r = new BiryaniRestaurant("Biryani House", "Kukatpally");
        r.displayDetails();
        r.receiveOrder();
        r.prepareFood();

        System.out.println();

        r = new Bakery("Fresh Bakery", "JNTU");
        r.displayDetails();
        r.receiveOrder();
        r.prepareFood();
    }
}


