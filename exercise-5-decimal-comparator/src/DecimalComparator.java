public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

       firstNumber = (int) (firstNumber * 1000);
       secondNumber = (int) (secondNumber * 1000);
       return firstNumber == secondNumber;
    }
}
