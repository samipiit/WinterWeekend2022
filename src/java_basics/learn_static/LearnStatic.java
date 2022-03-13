package java_basics.learn_static;

public class LearnStatic {

    // Static = unchanging, but that doesnt mean it's unchangeable
    static int x = 5;

    public static void main(String[] args) {
        x = 10;

        Dog fido = new Dog();
        Dog airBud = new Dog();

        fido.breed = "German Shepherd";
        airBud.breed = "Golden Retriever";

        fido.age = 10;
        fido.name = "Fido";
        airBud.age = 10;
        airBud.name = "Air Bud";

        System.out.println(fido.breed);
        System.out.println(airBud.breed);

        /*
         NOTE: We should always call static members of classes using ClassName, and not using references, such as we
               see below. The correct way to call 'typeOfAnimal' would be 'Dog.typeOfAnimal', since it is static and
               belongs to the class, and not the instances of the class
         */

        System.out.println(fido.typeOfAnimal);
        System.out.println(airBud.typeOfAnimal);

        Dog.typeOfAnimal = "Giraffe";

        System.out.println(fido.typeOfAnimal); // Giraffe
        System.out.println(airBud.typeOfAnimal); // Giraffe
    }

}
