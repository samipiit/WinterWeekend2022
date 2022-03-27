package java_intermediate.exception_handling;

public class LearnExceptionHandling {

    /*
    Exception Hierarchy
        1 - Checked Exceptions - Exceptions that the compiler is aware of (checks) at compile-time
        2 - Unchecked Exceptions - Exceptions that are not checked at compile-time, but rather found during run-time

    Try-Catch
        Try to do something, and if an exception is thrown, catch the specific (or use catch-all) exception and handle
        the program, gracefully

    Throw keyword
        Manually throw an exception upon a certain event occurring

    Throws keyword
     */

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException ae) {
            System.out.println("CANNOT DIVIDE BY 0 - YOU IDIOT!");
        }

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i <= arr.length; i++) {

            try {
                System.out.println(arr[i]);

                /*
                 Manually throw an exception, regardless of if the program throws it or not. We will learn more about
                    this when we learn Selenium.
                 */
                throw new ArithmeticException();

            } catch (ArrayIndexOutOfBoundsException aie) {
                System.out.println("Uh-oh, you need to check your index. It is out of bounds.\nMAX INDEX = " +
                        (arr.length - 1) + "\nLENGTH = " + (arr.length) + "\nCURRENT INDEX = " + i);
            } catch (ArithmeticException ae){
                System.out.println("Uh-oh, you can't divide by 0. What are you thinking?!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*
     Program will throw ArithmeticException IF IT OCCURS. It is up to the caller (where this method is called), to
        handle this possibility, by surrounding this method call with a try-catch block
     */

    public static void divideByZero() throws ArithmeticException {
        System.out.println(10/0);
    }
}
