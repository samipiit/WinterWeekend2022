package java_intermediate.oops.inheritance;

public class Car extends Vehicle {

    public Car(String typeOfVehicle, String typeOfEngine, String color, String manufacturer, String model,
               int numOfWheels, int numOfDoors, String typeOfTransmission, int numOfCylinders, int numOfWindows,
               int numOfSeats, int horsepower, int speed) {

        super(typeOfVehicle, typeOfEngine, color, manufacturer, model);

        this.numOfWheels = numOfWheels;
        this.numOfDoors = numOfDoors;
        this.typeOfTransmission = typeOfTransmission;
        this.numOfCylinders = numOfCylinders;
        this.numOfWindows = numOfWindows;
        this.numOfSeats = numOfSeats;
        this.horsepower = horsepower;
        this.speed = speed;
    }

    int numOfWheels;
    int numOfDoors;
    String typeOfTransmission;
    int numOfCylinders;
    int numOfWindows;
    int numOfSeats;
    int horsepower;
    int speed;

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

    @Override
    void accelerate() {
        super.accelerate();
        System.out.println("Speed is now " + speed);
    }

    @Override
    void decelerate() {
        super.decelerate();
    }

    @Override
    void turnOn() {
        super.turnOn();
    }

    @Override
    void turnOff() {
        super.turnOff();
    }
}
