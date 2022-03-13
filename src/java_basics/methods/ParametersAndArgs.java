package java_basics.methods;

public class ParametersAndArgs {

    // Parameters are the data that a method accepts
    // Arguments are the values we pass to a method when we call it

    public static void main(String[] args) {
        add(5, 10);
    }

    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

}
