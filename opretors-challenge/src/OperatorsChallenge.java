public class OperatorsChallenge {
    public static void main(String[] args) {

        double firstVariable = 20.00d;
        double secondVariable = 80.00d;

        double result = (firstVariable + secondVariable) * 100.00d;
        System.out.println("result = " + result);

        double remainder = result % 40.00d;
        System.out.println("remainder = " + remainder);

        boolean isRemainderIsZero = remainder == 0;
        System.out.println("isRemainderIsZero = " + isRemainderIsZero);

        if (!isRemainderIsZero) {
            System.out.println("Got some remainder");
        }
    }
}
