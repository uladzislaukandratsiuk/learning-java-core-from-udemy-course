public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println("Is 6 perfect number? " + isPerfectNumber(6));
        System.out.println("Is 28 perfect number? " + isPerfectNumber(28));
        System.out.println("Is 496 perfect number? " + isPerfectNumber(496));
        System.out.println("Is -1 perfect number? " + isPerfectNumber(-1));
        System.out.println("Is 5 perfect number? " + isPerfectNumber(5));
    }

    private static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int count = 1;
        int sumOfDivisors = 0;

        while (number > count) {
            if (number % count == 0) {
                sumOfDivisors += count;
            }
            count++;
        }

        return sumOfDivisors == number;
    }
}
