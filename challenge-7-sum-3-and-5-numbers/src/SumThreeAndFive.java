public class SumThreeAndFive {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (isDividedByThreeAndFive(i)) {
                sum += i;
                count++;
                System.out.println("Number that divided by 3 and 5 is " + i);

                if (count == 5){
                    System.out.println("Sum is " + sum);
                    break;
                }
            }
        }
    }

    private static boolean isDividedByThreeAndFive (int number) {

        return number % 3 == 0 && number % 5 == 0;
    }
}
