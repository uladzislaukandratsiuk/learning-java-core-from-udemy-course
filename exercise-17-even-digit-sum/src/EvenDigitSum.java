public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println("The sum of even digits in the number 122 = " + getEvenDigitSum(122));
        System.out.println("The sum of even digits in the number -122 = " + getEvenDigitSum(-122));
        System.out.println("The sum of even digits in the number 2 = " + getEvenDigitSum(2));
        System.out.println("The sum of even digits in the number 12 = " + getEvenDigitSum(12));
        System.out.println("The sum of even digits in the number 126298 = " + getEvenDigitSum(126298));
    }

    private static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int evenDigit;

        while (number > 0) {
            evenDigit = number % 10;
            number /= 10;
            if (evenDigit % 2 == 0) {
                sum += evenDigit;
            }
        }
        return sum;
    }
}
