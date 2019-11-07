public class Main {

    public static void main(String[] args) {

        System.out.println("-1000 is a leap year " + LeapYearCalculator.isLeapYear(-1000));
        System.out.println("1600 is a leap year " + LeapYearCalculator.isLeapYear(1600));
        System.out.println("2017 is a leap year " + LeapYearCalculator.isLeapYear(2017));
        System.out.println("2000 is a leap year " + LeapYearCalculator.isLeapYear(2000));
        System.out.println("1924 is a leap year " + LeapYearCalculator.isLeapYear(1924));
    }
}
