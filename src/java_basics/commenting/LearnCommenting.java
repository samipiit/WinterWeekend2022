package java_basics.commenting;

public class LearnCommenting {

    // Single Line Comment. Shortcut: CTRL + /

    /*
        Multi-Line
        Comment
        Shortcut: Type /* and press ENTER. Anything between the forward-slashes is considered a comment
     */

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        String word = "";
        // HOVER OVER someMethod() TO SEE DOC STRING
        boolean bool = someMethod(x, y, word);
    }

    /**
     * DOC STRING COMMENT - Placed above the method
     * Shortcut: Type /** and press ENTER. This is reference documentation for you or others devs to refer to, so
     *           that it is simple to understand what this method does
     *
     * @param num1 e.g. - First number to be added
     * @param num2 e.g. - Second number to be added
     * @param word e.g. - Word needed for this method
     *
     * @return Returns true if ____, else returns false
     */
    static boolean someMethod(int num1, int num2, String word) {


        int num3 = num1 + num2;
        System.out.println(word);

        return num3 > 1;
    }
}
