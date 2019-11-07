public class Main {

    public static void main(String[] args) {

        System.out.println("Is sum of 1 and 1 are equal to 1? "
                + EqualSumChecker.hasEqualSum(1, 1, 1));

        System.out.println("Is sum of 1 and 1 are equal to 2? "
                + EqualSumChecker.hasEqualSum(1, 1, 2));

        System.out.println("Is sum of 1 and 1 are equal to 1? "
                + EqualSumChecker.hasEqualSum(1, -1, 0));

        System.out.println("Is sum of 1 and 1 are equal to 1? "
                + EqualSumChecker.hasEqualSum(0, 1, 1));
    }
}
