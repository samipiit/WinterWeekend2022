package java_intermediate.control_flow;

public class LearnWhileLoops {

    /*
    WHILE LOOP
        While a condition is true and ONLY while the condition is true, loop/continue looping

    DO-WHILE LOOP
        Executes the loop first ALWAYS, and then checks the condition to see if it should continue looping
     */

    public static void main(String[] args) {
        int x = 0;

        while (x < 10) {
            System.out.println("LOOP " + (x + 1) + ": We are learning Java");
            x++;
        }

        do {
            System.out.println("LOOP " + (x + 1) + ": We are learning Java");
            x++;
        } while (x > 10);

    }

}
