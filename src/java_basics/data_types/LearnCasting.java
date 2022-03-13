package java_basics.data_types;

public class LearnCasting {

    public static void main(String[] args) {

        short myShort = 4386;
        int convertedInt;
        long convertedLong;

        // Widening
        convertedInt = (int) myShort;
        convertedLong = (long) myShort;

//        System.out.println(convertedInt);
//        System.out.println(convertedLong);

        // Narrowing
        int num1 = 32768;
        short shortNum = (short) num1;

        System.out.println(shortNum);

        double myDouble = 50.534995265499572;
        float myFloat = (float) myDouble;

        System.out.println(myFloat);

        // Primitive to Non-Primitive
        int age = 25;
        String stringifiedAge = String.valueOf(age);
        System.out.println(stringifiedAge);

        // Non-Primitive to Primitive - WRAPPER CLASSES
        String myAge = "25";

        int myNumericIntAge = Integer.valueOf(myAge);
        short myNumericShortAge = Short.valueOf(myAge);

        System.out.println(myNumericIntAge);
        System.out.println(myNumericShortAge);

    }

}
