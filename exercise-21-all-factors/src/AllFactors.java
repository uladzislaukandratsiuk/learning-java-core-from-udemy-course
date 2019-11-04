public class AllFactors {

    public static void main(String[] args) {

        //A factor is a number that divides into another number exactly and without leaving a remainder.

        System.out.println("All factors for 6:");
        printFactors(6);
        System.out.println("All factors for 32:");
        printFactors(32);
        System.out.println("All factors for -2:");
        printFactors(-2);
        System.out.println("All factors for 214:");
        printFactors(214);
    }

    private static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int count = 1;

        while (number >= count) {
            if (number % count == 0) {
                System.out.println(count);
            }
            count++;
        }
    }
}
