package javacoreconcept.inheratence;
// Grandparent class
class Vehicle {
    void startEngine() {
        System.out.println("Starting engine...");
    }
}

// Parent class
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Accelerating...");
    }
}

// Child class
class SportsCar extends Car {
    void turboBoost() {
        System.out.println("Turbo boosting...");
    }
}

public class mutilevelinherte {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.startEngine();  // Output: Starting engine...
        sportsCar.accelerate();   // Output: Accelerating...
        sportsCar.turboBoost();   // Output: Turbo boosting...
    }
}