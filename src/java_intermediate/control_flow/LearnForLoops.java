package java_intermediate.control_flow;

import java.util.ArrayList;
import java.util.List;

public class LearnForLoops {

    public static void main(String[] args) {
    /*
    FOR LOOP
        Used when we know EXACTLY how many iterations we need to loop
     */
        String name = "Gaurav";

        // Print name 5 times
        // First statement: Starting point of the loop
        // Second statement: Condition under which the loop shall continue looping
        // Third statement: What is performed at the END of each iteration/loop
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }

    /*
    FOR-EACH LOOP
        Used typically with data structures. Typically used when we don't know the number of iterations needed
     */
        int[] myIntArray = {5, 8324, 213, 19, -20, 21884, 8574, 390, -4736, 9340, 9999, 10192, 475};


        for (int x : myIntArray) {
            System.out.println(x);
        }

    }


}
