package java_intermediate.oops.abstraction;

abstract class LearnAbstraction {

    /*
     `abstract` is a keyword used in Java
        You can apply it to classes, and methods, but NOT variables
        1. An abstract class may or may not contain abstract methods (meaning an abstract class does not HAVE to be 100%
            abstract), however, if there is an abstract method within a
            class, then the class MUST be abstract
            - Abstract method = method without implementation
            - Concrete method = method with implementation
     */

    abstract void doSomething();

    abstract boolean isThisTrue();

    void printName() {
        System.out.println("Sami");
    }

}
