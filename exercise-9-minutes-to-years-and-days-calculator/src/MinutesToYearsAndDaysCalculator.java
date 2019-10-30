public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(-561600);
        printYearsAndDays(12561600);
        printYearsAndDays(1561600);
        printYearsAndDays(251600);
    }

    private static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 60 / 24 / 365;
            long days = minutes / 60 / 24 % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
