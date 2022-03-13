package java_intermediate.oops.polymorphism;

public class LearnCompileTimePoly {

    /*
     Compile-Time Polymorphism aka Method Overloading
        Creating the same method (same name), but accepting:
            1. Different number of parameters
            2. Different data types of parameters OR
            3. Different order of parameters
     */

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 25;
        short a = 15;
        short b = 100;

        int sumOfTwoNumbers = addition(a, y);
        System.out.println(sumOfTwoNumbers);
    }

    static int addition(int num1, int num2) {
       return num1 + num2;
    }

    static int addition(short num1, int num2) {
        return num1 + num2;
    }

    static int addition(int num1, short num2) {
        return num1 + num2;
    }

    static int addition(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
