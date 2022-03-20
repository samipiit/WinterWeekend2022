package java_intermediate.oops.inheritance;

public class TestInheritance {

    public static void main(String[] args) {
        Car bmw = new Car("Car", "Motor", "Alpina White", "BMW", "M3 CS",
                4, 4, "Manual", 8, 6, 4,
                650, 60);

        // BMW type is also Vehicle type, so both of the following statements will be true
//        boolean isInstanceVehicle = bmw instanceof Vehicle;
//        boolean isInstanceCar = bmw instanceof Car;
//
//        System.out.println(isInstanceVehicle);
//        System.out.println(isInstanceCar);
//

        Vehicle obj = new Vehicle("Car", "Motor", "Alpina White", "BMW",
                "M3 CS");
        obj.accelerate();
        System.out.println();
        bmw.accelerate();

    }
}
