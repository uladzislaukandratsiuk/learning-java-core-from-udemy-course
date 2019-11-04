public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println("Greatest common count of 12 and 30 = " + getGreatestCommonDivisor(12, 30));
        System.out.println("Greatest common count of 25 and 15 = " + getGreatestCommonDivisor(25, 15));
        System.out.println("Greatest common count of 9 and 18 = " + getGreatestCommonDivisor(9, 18));
        System.out.println("Greatest common count of 81 and 153 = " + getGreatestCommonDivisor(81, 153));
        System.out.println("Greatest common count of 14 and 18 = " + getGreatestCommonDivisor(14, 18));
    }

    private static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {

        if (firstNumber < 10 || secondNumber < 10) {
            return -1;
        }

        int count = 1;
        int greatestCommonDivisor = 0;
        int biggestNumber = Math.max(firstNumber, secondNumber);

        while (biggestNumber != count) {
            if (firstNumber % count == 0 && secondNumber % count == 0) {
                greatestCommonDivisor = count;
                count++;
                continue;
            }
            count++;
        }
        return greatestCommonDivisor;
    }
}
