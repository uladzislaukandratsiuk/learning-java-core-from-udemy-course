public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println("Days in month " + getDaysInMonth(1, -1000));
        System.out.println("Days in month " + getDaysInMonth(2, 1600));
        System.out.println("Days in month " + getDaysInMonth(2, 2020));
        System.out.println("Days in month " + getDaysInMonth(3, 2017));
        System.out.println("Days in month " + getDaysInMonth(-1, 2000));
        System.out.println("Days in month " + getDaysInMonth(4, 1924));
    }

    private static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        }
        return false;
    }

    private static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else return 28;
            default:
                return 31;
        }
    }
}

