package java_intermediate.singleton;

public class LearnSingleton {

    static LearnSingleton learnSingleton;

    private LearnSingleton() {

    }

    /*
    A singleton is a class. Singleton design allows ONLY ONE object to be created of that class
        Steps:
            1. Declare a static instance of the class, as a global var
            2. Declare the constructor as PRIVATE
            3. Create getInstance() method
     */

    public static LearnSingleton getInstance() {
        if (learnSingleton == null) {
            learnSingleton = new LearnSingleton();
        }

        return learnSingleton;
    }

}
