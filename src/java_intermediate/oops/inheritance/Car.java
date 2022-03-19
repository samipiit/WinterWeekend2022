package java_intermediate.oops.inheritance;

public class Car extends Vehicle {

    int numOfWheels;
    int numOfDoors;
    String typeOfTransmission;
    int numOfCylinders;
    int numOfWindows;
    int numOfSeats;
    int horsepower;

    void turnLeft() {
        System.out.println("Car is turning left");
    }

    void turnRight() {
        System.out.println("Car is turning right");
    }

    void turnOnHeadlights() {
        System.out.println("Car's headlights are on");
    }

    void turnOffHeadlights() {
        System.out.println("Car's headlights are off");
    }

    void indicateRightTurn() {
        System.out.println("Car's right indicator is blinking");
    }

    void indicateLeftTurn() {
        System.out.println("Car's left indicator is blinking");
    }
}
