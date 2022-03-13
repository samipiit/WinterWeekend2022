package java_basics.methods;

public class LearnMethods {

    /*
    Methods
        - There are 2 types of methods
            1. Methods that perform an action and don't return anything
            2. Methods that perform some sort of operation/action and return some sort of value
        - Method signatures or method declarations contain certain things:
            1. Access Modifier (Optional)
            2. Static (Optional)
            3. Return Type (Mandatory)
            4. Method Name (Mandatory)
            5. Parenthesis/Parameters (Mandatory)
            6. Code Block (Mandatory)
     */

    public static void main(String[] args) {
        doSomething();
        int z = doSomethingElse();
        System.out.println(5 + z); // 5510

        int sum = getSum();
        System.out.println(sum);
    }

    static void doSomething() {
        System.out.println("This method is doing something");
    }

    // 510
    static int doSomethingElse() {
        int x = 5;
        int y = 10;

        return x + y;
    }

    // Method names should almost always start with a verb (get, do, verify, etc)
    static int getSum() {
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        return a + b;
    }
}
