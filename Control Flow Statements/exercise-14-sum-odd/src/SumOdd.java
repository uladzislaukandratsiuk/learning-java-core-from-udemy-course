public class SumOdd {

    public static void main(String[] args) {
        System.out.println("The sum of the odd numbers in the range (1-100) " + sumOdd(100, 100));
        System.out.println("The sum of the odd numbers in the range (1-100) " + sumOdd(13, 13));
        System.out.println("The sum of the odd numbers in the range (1-100) " + sumOdd(1, 100));
        System.out.println("The sum of the odd numbers in the range (1-100) " + sumOdd(100, 1000));
        System.out.println("Invalid value " + sumOdd(-1, 100));
    }

    private static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    private static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || start > end) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
