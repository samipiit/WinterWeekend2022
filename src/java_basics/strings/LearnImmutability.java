package java_basics.strings;

public class LearnImmutability {

    public static void main(String[] args) {
        String studentOne = "Sami";
        String studentTwo = "Sami";

        System.out.println(studentOne.equals(studentTwo));

        // TODO: new String() should create new String obj, however new keyword is not being called.
        String studentThree = new String("Sami");

        System.out.println(studentOne.equals(studentThree));
    }
}
