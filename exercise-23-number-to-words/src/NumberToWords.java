public class NumberToWords {

    public static void main(String[] args) {

        System.out.println("123 to words");
        numberToWords(123);
        System.out.println("1010 to words");
        numberToWords(1010);
        System.out.println("5200 to words");
        numberToWords(5200);
        System.out.println("0 to words");
        numberToWords(0);
        System.out.println("4 to words");
        numberToWords(4);
        System.out.println("-12 to words");
        numberToWords(-12);
    }

    private static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);
        int reverseDigitCount = 0;
        int digit;

        while (reversedNumber > 0) {
            digit = reversedNumber % 10;
            reversedNumber /= 10;
            reverseDigitCount++;
            printNumberInWord(digit);
        }

        for (int i = reverseDigitCount; i < digitCount; i++) {
            printNumberInWord(0);
        }
    }

    private static int reverse(int number) {

        int reverseNumber = 0;
        int temp = number;

        while (temp != 0) {
            reverseNumber *= 10;
            reverseNumber += temp % 10;
            temp /= 10;
        }

        return reverseNumber;
    }

    private static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int countOfDigits = 0;

        while (number > 0) {
            number /= 10;
            countOfDigits++;
        }

        return countOfDigits;
    }

    private static void printNumberInWord(int number) {

        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
    }
}
