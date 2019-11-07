import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;
        int inputNumber;

        while (true) {

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                ++count;
                inputNumber = scanner.nextInt();
                sum += inputNumber;
                average = Math.round((double) sum / count);
            } else {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
