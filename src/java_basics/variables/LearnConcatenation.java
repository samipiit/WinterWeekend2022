package java_basics.variables;

public class LearnConcatenation {

    static String word1 = "Hello";
    static String char1 = ",";
    static String word2 = "world";
    static char exclaim = '!';
    static String space = " ";
    static int x = 5;
    static int y = 10;
    static String x1 = "5";
    static String y1 = "10";
    static String quote = "\"You miss 100% of the shots you don't take\"\n\n\t\t\t\t- Wayne Gretzskyy\b\b\b\b";

    // Concat
    public static void main(String[] args) {
        // String concat
//        System.out.println("LINE 13: Hello" + ", " + "world!");
//        System.out.println("LINE 14: " + word1 + char1 + space + word2 + exclaim);

//        // Numerical concat?
        System.out.println(y + x); // 15
//        System.out.println(x1 + space + y1); // 5 10

        // Escape character
//        System.out.println(quote);

    }

}
