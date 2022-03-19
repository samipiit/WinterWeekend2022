package java_intermediate.oops.inheritance;

import java_intermediate.oops.inheritance.bad_inheritance.Bird;

public class TestInheritance {

    public static void main(String[] args) {
        Car astonMartin = new Car();
        astonMartin.manufacturer = "Aston Martin";
        astonMartin.model = "V12 Vantage";
        astonMartin.color = "Forest Green";
        astonMartin.horsepower = 675;
        astonMartin.numOfCylinders = 12;
        astonMartin.numOfDoors = 2;
        astonMartin.numOfSeats = 4;
        astonMartin.typeOfVehicle = "Car";
        astonMartin.turnOn();
        astonMartin.turnOff();
        astonMartin.accelerate();
        astonMartin.decelerate();

        Boat boat = new Boat();
        boat.typeOfVehicle = "Boat";
        boat.turnOn();
        boat.turnOff();
        boat.accelerate();
        boat.decelerate();

        Train mta = new Train();
        mta.typeOfVehicle = "Train";
        mta.turnOn();
        mta.turnOff();
        mta.accelerate();
        mta.decelerate();

        Motorcycle harley = new Motorcycle();

//        Bird penguin = new Bird();
        // JAVA WILL NOT KNOW WHICH METHOD (from which class) WE ARE CALLING. IS IT FROM THE ANIMAL CLASS OR THE MAMMAL CLASS?
//        penguin.eat();

    }
}
