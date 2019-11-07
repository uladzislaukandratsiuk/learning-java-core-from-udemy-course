public class DigitSum {

    public static void main(String[] args) {

        System.out.println("Sum of digits of a number 13 = " + sumDigits(13));
        System.out.println("Sum of digits of a number 125 = " + sumDigits(125));
        System.out.println("Sum of digits of a number 4213 = " + sumDigits(4213));
        System.out.println("Sum of digits of a number 9 = " + sumDigits(9));
        System.out.println("Sum of digits of a number -2 = " + sumDigits(-2));
    }

    private static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
