public class Main {

    public static void main(String[] args) {

        System.out.println("Is 3.1523 and 3.152 are equal by three decimal places "
                + DecimalComparator.areEqualByThreeDecimalPlaces(3.1523, 3.152));

        System.out.println("Is -3.1756 and -3.175 are equal by three decimal places "
                + DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        System.out.println("Is 3.0 and 3.0 are equal by three decimal places "
                + DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));

        System.out.println("Is -3.123 and 3.123 are equal by three decimal places "
                + DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
