package java_intermediate.control_flow;

public class LearnConditionals {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println(doSubtraction(x, y));
    }

    static int doSubtraction(int num1, int num2) {
        /*
         If num1 is NOT greater than or equal to num2, then we KNOW that num2 is greater than num1. This is why we
         don't need an else condition.

         REMINDER: Once a method hits any return statement, the method execution stops. Java will not execute a method
                   any further than a return statement.
         */

        if (num1 >= num2) {
            return num1 - num2;
        }

        return num2 - num1;
    }

}
