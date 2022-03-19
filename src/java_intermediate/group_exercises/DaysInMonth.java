package java_intermediate.group_exercises;

public class DaysInMonth {

    public static void main(String[] args) {
        DaysInMonth obj = new DaysInMonth();
        System.out.println(obj.getDaysInMonth(4, 2018)); // 30
        System.out.println(obj.getDaysInMonth(10, 1995)); // 31
        System.out.println(obj.getDaysInMonth(2, 2012)); // 29
        System.out.println(obj.getDaysInMonth(6, 2011)); // 30
        System.out.println(obj.getDaysInMonth(12, 2017)); // 31
        System.out.println(obj.getDaysInMonth(2, 2005)); // 28
        System.out.println(obj.getDaysInMonth(-5, 2022)); // -1
        System.out.println(obj.getDaysInMonth(7, 10292)); // -1
        System.out.println(obj.getDaysInMonth(5, 1968)); // 31
        System.out.println(obj.getDaysInMonth(3, 768)); // 31

    }

    public int getDaysInMonth(int month, int year) {
        int numOfDays;

        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numOfDays = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    numOfDays = 29;
                } else {
                    numOfDays = 28;
                }
                break;
                /*
                 HINT: A year is a leap year if it is divisible by 4, but not by 100,
                       or if it is divisible by 400
                 */

            default:
                return -1;
        }

        return numOfDays;
    }


    public boolean isLeapYear(int year) {
        boolean isLeap = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }

        return isLeap;
    }


}
