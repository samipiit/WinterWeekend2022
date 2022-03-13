package java_basics.scanner;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("PLEASE ENTER 1ST NUMBER: ");
        int x = scanner.nextInt();

        System.out.print("PLEASE ENTER 2ND NUMBER: ");
        int y = scanner.nextInt();

        System.out.println("ADDITION: " + doAddition(x, y));
        System.out.println("SUBTRACTION: " + doSubtraction(x, y));
        System.out.println("MULTIPLICATION: " + doMultiplication(x, y));
        System.out.println("DIVISION: " + doDivision(x, y));
    }

    static int doAddition(int num1, int num2) {
        return num1 + num2;
    }

    static int doSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    static int doMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    static int doDivision(int num1, int num2) {
        return num1 / num2;
    }

}
