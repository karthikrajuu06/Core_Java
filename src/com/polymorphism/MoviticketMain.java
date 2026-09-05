package com.polymorphism;

public class MoviticketMain{

    public static void main(String[] args) {

        MovieTicket obj = new MovieTicket();

        System.out.println("Total Amount = " + obj.bookTicket(5));

        System.out.println("Total Amount = " + obj.bookTicket(5, true));

        System.out.println("Final Amount = " + obj.bookTicket(5, true, 10));
    }
}
