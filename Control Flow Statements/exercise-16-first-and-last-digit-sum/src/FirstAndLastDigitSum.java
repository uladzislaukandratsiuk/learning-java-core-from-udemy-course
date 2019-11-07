public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println("Sum first and last digits of 212 = " + sumFirstAndLastDigit(212));
        System.out.println("Sum first and last digits of 257 = " + sumFirstAndLastDigit(257));
        System.out.println("Sum first and last digits of 0 = " + sumFirstAndLastDigit(0));
        System.out.println("Sum first and last digits of -257 = " + sumFirstAndLastDigit(-257));
        System.out.println("Sum first and last digits of 10 = " + sumFirstAndLastDigit(10));
    }

    private static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = number;
        int lastDigit = number % 10;

        while (firstDigit > 9) {
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }
}
