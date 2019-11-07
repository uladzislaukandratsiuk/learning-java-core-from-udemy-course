public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(5);
        printSquareStar(9);
    }

    private static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {

                    if (i == number || j == number || i == 1 || j == 1 || i == j || i + j == number + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

