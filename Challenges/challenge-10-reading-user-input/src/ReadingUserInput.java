import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        sumNumbersFromInput(5);
    }

    private static void sumNumbersFromInput(int countOfNumbers) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 1;
        int inputNumber;
        boolean hasNextInt;

        while (count <= countOfNumbers) {

            System.out.println("Enter number #" + count + ":");

            hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                inputNumber = scanner.nextInt();
                count++;
                sum += inputNumber;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}

