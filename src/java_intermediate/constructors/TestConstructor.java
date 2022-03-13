package java_intermediate.constructors;

public class TestConstructor {

    public static void main(String[] args) {
        Car bmw = new Car("BMW", "M5 CS", 2022);
        Car lamborghini = new Car("Lamborghini", 2022, "Red");
        Car nissan = new Car(2022, "Nissan", "Nismo GTR", "White");

        System.out.println("YEAR: " + bmw.year);
        System.out.println("MAKE: " + bmw.make);
        System.out.println("MODEL: " + bmw.model);
        System.out.println("TYPE: " + Car.typeOfVehicle);
        System.out.println();
        System.out.println("YEAR: " + lamborghini.year);
        System.out.println("MAKE: " + lamborghini.make);
        System.out.println("COLOR: " + lamborghini.color);
        System.out.println("TYPE: " + Car.typeOfVehicle);
        System.out.println();
        System.out.println("YEAR: " + nissan.year);
        System.out.println("MAKE: " + nissan.make);
        System.out.println("MODEL: " + nissan.model);
        System.out.println("COLOR: " + nissan.color);
        System.out.println("TYPE: " + Car.typeOfVehicle);
    }

}
