package java_basics.operators;

public class LearnOperators {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
    /*
     Assignment Operators - Used to assign a value to a variable
        - Equal sign (=)
        - Incremental operator (+=)
        - Decremental operator (-=)
    */
//        System.out.println(x);
//        x = x + 1;
//        System.out.println(x);
//        x += 1;
//        System.out.println(x);
//        x -= 5;
//        System.out.println(x); // 2
//        x *= 3;
//        System.out.println(x); // 6

    /*
     Comparison Operators - Used to check if 2 values are equal/not equal
        - Equal to (==)
        - Is not equal to (!=)
        - Greater than (>)
        - Greather than or equal to (>=)
        - Less than (<)
        - Less than or equal to (<=)
     */

        boolean isEqual;
        boolean isNotEqual;
        boolean isGreaterThan;
        boolean isGreatherThanOrEqualTo;
        boolean isLessThan;
        boolean isLessThanOrEqualTo;

        // False
        isEqual = x == y;
        System.out.println(isEqual);
        // True
        isNotEqual = x != y;
        System.out.println(isNotEqual);
        // False
        isGreaterThan = x > y;
        System.out.println(isGreaterThan);
        // False
        isGreatherThanOrEqualTo = x >= y;
        System.out.println(isGreatherThanOrEqualTo);
        // True
        isLessThan = x < y;
        System.out.println(isLessThan);
        // True
        isLessThanOrEqualTo = x <= y;
        System.out.println(isLessThanOrEqualTo);

        /*
        Logical Operators
           - Used to logically add two conditionals (And, Or)
           - And (&&)
           - Or (||)
         */

        boolean twoConditions;
        twoConditions = !isGreaterThan && isLessThanOrEqualTo;
        System.out.println("\n" + twoConditions);

        boolean secondCondition = isGreaterThan || isGreatherThanOrEqualTo;
        System.out.println(secondCondition);

        boolean thirdCondition =  (isLessThan || isLessThanOrEqualTo) || (isGreaterThan && isLessThanOrEqualTo);
        System.out.println(thirdCondition);


        // Expressions always evaluate to some sort of value
        // e.g. - 1 + 2 evaluates to 3
        // int z = 1 + 2;
    }

}
