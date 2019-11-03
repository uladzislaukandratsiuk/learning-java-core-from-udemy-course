public class SharedDigit {

    public static void main(String[] args) {
        System.out.println("12, 23 has shared digit? " + hasSharedDigit(12, 23));
        System.out.println("9, 99 has shared digit? " + hasSharedDigit(9, 99));
        System.out.println("15, 55 has shared digit? " + hasSharedDigit(15, 55));
        System.out.println("13, 63 has shared digit? " + hasSharedDigit(13,63));
    }

    private static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        int firstDigitOfFirstNumber = firstNumber / 10;
        int lastDigitOfFirstNumber = firstNumber % 10;
        int firstDigitOfSecondNumber = secondNumber / 10;
        int lastDigitOfSecondNumber = secondNumber % 10;

        return firstDigitOfFirstNumber == firstDigitOfSecondNumber
                || firstDigitOfFirstNumber == lastDigitOfSecondNumber
                || lastDigitOfFirstNumber == firstDigitOfSecondNumber
                || lastDigitOfFirstNumber == lastDigitOfSecondNumber;
    }
}
