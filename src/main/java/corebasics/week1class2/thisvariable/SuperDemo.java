package corebasics.week1class2.thisvariable;

// Parent class: FirstWeekAssignments.Vehicle
class Vehicle {
    int speed;
    int capacity;

    // Constructor to initialize FirstWeekAssignments.Vehicle properties
    Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    void showDetails() {
        System.out.println("Speed: " + speed + " km/h, Capacity: " + capacity + " passengers");
    }
}

// Child class: FirstWeekAssignments.Car
class Car extends Vehicle {
    String fuelType;

    // Constructor for FirstWeekAssignments.Car using 'super' to call parent constructor
    Car(int speed, int capacity, String fuelType) {
        super(speed, capacity); // Calls FirstWeekAssignments.Vehicle constructor
        this.fuelType = fuelType; // Uses 'this' to refer to current instance variable
    }

    void showDetails() {
        super.showDetails(); // Calls parent method
        System.out.println("Fuel Type: " + this.fuelType); // Uses 'this' to access instance variable
    }
}

// FirstWeekAssignments.Main program
public class SuperDemo {
    public static void main(String[] args) {
        Car myCar = new Car(333, 5, "Diesel");
        myCar.showDetails(); // Display ride details
    }
}
