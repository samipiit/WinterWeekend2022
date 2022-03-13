package java_basics.accessModifiers;

class LearnAccessModifiers {

    public static int x = 5;
    public static int y = 10;
    public static int z = 50;

    /*
    Access Modifiers
        Can be applied to variables (fields), methods, and classes
        1. Public - Accessible by all packages/classes in the same project
        2. Protected - Accessible by all classes within the same package
        3. Private - Accessible by only the class it was declared within
        4. Default - Same as Protected
     */

    static void printName() {
        System.out.println("Sufian Hasani");
    }
}
