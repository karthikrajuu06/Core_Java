package com.constructor;

class Mobile
{
    int mobileId;
    String brand;
    String model;
    double price;

    // Default Constructor
     public Mobile()
    {
        mobileId = 1001;
        brand = "Samsung";
        model = "Galaxy A35";
        price = 28000.0;
    }

    // Parameterized Constructor
     public Mobile(int mobileId, String brand, String model, double price)
    {
        this.mobileId = mobileId;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy Constructor
  public   Mobile(Mobile m)
    {
        mobileId = m.mobileId;
        brand = m.brand;
        model = m.model;
        price = m.price;
    }

    // Display Method
   public  void display()
    {
        System.out.println("Mobile ID : " + mobileId);
        System.out.println("Brand     : " + brand);
        System.out.println("Model     : " + model);
        System.out.println("Price     : " + price);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // Default Constructor
        Mobile m1 = new Mobile();

        // Parameterized Constructor
        Mobile m2 = new Mobile(1002, "OnePlus", "Nord CE 5", 24999.0);

        // Copy Constructor
        Mobile m3 = new Mobile(m2);

        System.out.println("================== MOBILE DETAILS ==================\n");

        System.out.println("Mobile 1 (Default Constructor)");
        System.out.println("--------------------------------");
        m1.display();

        System.out.println();

        System.out.println("Mobile 2 (Parameterized Constructor)");
        System.out.println("------------------------------------");
        m2.display();

        System.out.println();

        System.out.println("Mobile 3 (Copy Constructor)");
        System.out.println("---------------------------");
        m3.display();

        // Change Mobile 3 Price
        m3.price = 23000.0;

        System.out.println("\n====================================================");
        System.out.println("After Updating the Price of Mobile 3");
        System.out.println("====================================================\n");

        System.out.println("Mobile 2 Details");
        System.out.println("----------------");
        m2.display();

        System.out.println();

        System.out.println("Mobile 3 Details");
        System.out.println("----------------");
        m3.display();
    }
}