public class ForStatement {

    public static void main(String[] args) {

        for (double i = 1.5; i < 6; i++) {
            System.out.println("8524 at " + i + "% interest = "
                    + String.format("%.2f",calculateInterest(8524, i)));
        }

        System.out.println("****************************");

        for (double i = 10.5; i > 5; i--) {
            System.out.println("5312 at " + i + "% interest = "
                    + String.format("%.2f",calculateInterest(5312, i)));
        }

        System.out.println("****************************");

        int count = 0;

        for (int i = 0; i < 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime number");
                count++;
                if (count == 5) {
                    System.out.println("Exit the loop");
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int n) {

        if (n == 1 || n == 0) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
