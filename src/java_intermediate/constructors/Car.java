package java_intermediate.constructors;

public class Car {

    // A class is a blueprint of a real-world object
    // Classes have states (attributes) and behaviors (methods) of that real-world object

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    Car(String make, int year, String color) {
        this.make = make;
        this.year = year;
        this.color = color;
    }

    Car(int year, String make, String model, String color) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
    }


    String make;
    String model;
    String color;
    int year;
    public static String typeOfVehicle = "Car";

    void accelerate() {

    }

    void decelerate() {

    }

    void turnLeft() {

    }

    void turnRight() {

    }

}
