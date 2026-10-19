package com.Inheritances;

public class SingleInheritance {

	// Superclass (Parent Class)
	class Animal {
	    String name = "Generic Animal";

	    void eat() {
	        System.out.println("This animal eats food.");
	    }
	}

	// Subclass (Child Class) inheriting from Animal
	class Dog extends Animal {
	    // Specialized method unique to the Dog class
	    void bark() {
	        System.out.println("The dog barks: Woof! Woof!");
	    }
	}

	// Main class to execute the program
	public class Main {
	    public static void main(String[] args) {
	        // Create an object of the subclass
	        Dog myDog = new Dog();

	        // Access the inherited field and method from the Animal class
	        System.out.println("Animal Name: " + myDog.name);
	        myDog.eat();

	        // Access the method belonging specifically to the Dog class
	        myDog.bark();
	    }
	}


}
