package java_basics.variables;

public class LearnVariable {

    /*
     Global/Instance - 'X' belongs to each instance of this class. Accessible by all members of this class, and even in
                       other classes/packages by creating an instance of this class
     */
    int x;

    static void doSomething(int x) {
        // Local - Scope is limited to just this method. No other member of this class can access this variable.
        int y;
    }

    void doSomethingElse() {
        x = 5;
        doSomething(x);
    }

    void doAnotherThing() {
        x = 55;
        System.out.println(x);
    }

}
