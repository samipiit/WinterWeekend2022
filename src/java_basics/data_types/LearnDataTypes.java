package java_basics.data_types;

public class LearnDataTypes {

    // 1 Byte of memory
    byte minByte = -128;
    byte maxByte = 127;
    static byte defaultByte;

    // 2 Bytes of memory
    short minShort = -32768;
    short maxShort = 32767;
    static short defaultShort;

    // 4 Bytes of memory
    int minInt = -2147483648;
    int maxInt = 2147483647;
    static int defaultInt;

    // 8 Bytes of memory (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
    long minLong = -9223372036854775808L;
    long maxLong = 9223372036854775807L;
    static long defaultLong;

    // 4 Bytes of memory
    float aFloat = 105.667865f;
    static float defaultFloat;

    // 8 Bytes of memory
    double aDouble = 105.667865393756123;
    static double defaultDouble;

    // 1 Bit
    boolean isItRainy = false;
    static boolean defaultBoolean;

    // 2 Bytes
    char aChar = 'a';
    static char defaultChar;

    public static void main(String[] args) {
        System.out.println(defaultByte);
        System.out.println(defaultShort);
        System.out.println(defaultInt);
        System.out.println(defaultLong);
        System.out.println(defaultFloat);
        System.out.println(defaultDouble);
        System.out.println(defaultBoolean);
        System.out.println(defaultChar);
    }
}
