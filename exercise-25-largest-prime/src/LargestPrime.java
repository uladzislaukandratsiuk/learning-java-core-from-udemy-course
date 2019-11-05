public class LargestPrime {

    public static void main(String[] args) {

        System.out.println("Largest prime factor of a 45 " + getLargestPrime(45));
        System.out.println("Largest prime factor of a 31 " + getLargestPrime(31));
        System.out.println("Largest prime factor of a 21 " + getLargestPrime(21));
        System.out.println("Largest prime factor of a 57 " + getLargestPrime(57));
    }

    private static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int divisor = 2;

        while (number > divisor) {
            if (number % divisor == 0) {
                number /= divisor;
            } else {
                divisor++;
            }
        }
        return divisor;
    }
}
