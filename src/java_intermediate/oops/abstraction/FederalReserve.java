package java_intermediate.oops.abstraction;

public interface FederalReserve {

    double fedFundsRate = 2;

    /*
    Interfaces are 100% abstract
        1. Interfaces cannot be instantiated
        2. When implementing an interface, ALL of it's methods must be implemented
        3. Interface methods are, by default, abstract and public
        4. Interface attributes are, by default, public, static and FINAL
     */

    void printName();


}
