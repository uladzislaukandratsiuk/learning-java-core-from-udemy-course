public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println("41, 22, 71 have one same last digit? "
                + hasSameLastDigit(41, 22, 71));
        System.out.println("23, 32, 42 have one same last digit? "
                + hasSameLastDigit(23, 32, 42));
        System.out.println("10, 22, 1000 have one same last digit? "
                + hasSameLastDigit(10, 22, 1000));
        System.out.println("9, 99, 999 have one same last digit? "
                + hasSameLastDigit(9, 99, 999));
        System.out.println("is 9 valid " + isValid(9));
        System.out.println("is 10 valid " + isValid(10));
    }

    private static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }

        int firstNumberLastDigit = firstNumber % 10;
        int secondNumberLastDigit = secondNumber % 10;
        int thirdNumberLastDigit = thirdNumber % 10;

        return  firstNumberLastDigit == secondNumberLastDigit
                || firstNumberLastDigit == thirdNumberLastDigit
                || secondNumberLastDigit == thirdNumberLastDigit;
    }

    private static boolean isValid(int number) {

        return number >= 10 && number <= 1000;
    }
}
