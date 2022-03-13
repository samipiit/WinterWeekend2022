package java_basics.strings;

public class LearnStrings {

    static String name = "Gaurav";
    static String otherName = "GauravG";

    public static void main(String[] args) {
        int length = name.length();

        System.out.println(length);

        System.out.println(name.toUpperCase());

        System.out.println(name.trim());

        // End index is up to, but not including (exclusive)
        System.out.println(name.substring(0, 3));

        int index = name.indexOf("Z");
        System.out.println(index);

        // Comparison using strings vs other numerical data types
        int x = 5;
        int y = 5;

        boolean isSame = x == y;
        System.out.println(isSame);

        isSame = name.equals(otherName);
        System.out.println(isSame);

        // Look at this warning
        isSame = name == otherName;
        System.out.println(isSame);

    }

}
