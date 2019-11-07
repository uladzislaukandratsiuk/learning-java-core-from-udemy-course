import java.util.Scanner;

public class MinAndMaxInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt;
        int countOfNumbers = 5;
        int count = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int inputNumber;


        while (count <= countOfNumbers) {

            System.out.println("Enter number #" + count + ":");

            hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                inputNumber = scanner.nextInt();
                count++;

                if (inputNumber > max) {
                    max = inputNumber;
                }

                if (inputNumber < min) {
                    min = inputNumber;
                }

            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("max = " + max + " min = " + min);
        scanner.close();
    }
}
