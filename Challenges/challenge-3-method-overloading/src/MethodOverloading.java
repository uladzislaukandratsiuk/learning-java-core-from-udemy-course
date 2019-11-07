public class MethodOverloading {

    public static void main(String[] args) {

        double feetAndInchesToCentimeters = calculateFeetAndInchesToCentimeters(12, 5);
        if (feetAndInchesToCentimeters <= 0) {
            System.out.println("Feet and inches parameters has to be greater than zero!");
        }
        double inchesToCentimeters = calculateFeetAndInchesToCentimeters(124);
        if (inchesToCentimeters <= 0) {
            System.out.println("Inches parameters has to be greater than zero!");
        }

    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameter");
            return -1;
        }
        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            System.out.println("Invalid inches parameter");
            return -1;
        }
        double feet = (int) (inches / 12);
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
        return calculateFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
