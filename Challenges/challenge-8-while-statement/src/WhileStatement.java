public class WhileStatement {

    public static void main(String[] args) {

        int number = 0;
        int countOfEvenNumbers = 0;

        while (number <= 20) {
            number++;
            
            if (!isEvenNumber(number)) {
                continue;
            }
            countOfEvenNumbers++;
            System.out.println("Even number = " + number);

            if (countOfEvenNumbers >= 5) {
                break;
            }
        }
        System.out.println("Total of even numbers = " + countOfEvenNumbers);
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
