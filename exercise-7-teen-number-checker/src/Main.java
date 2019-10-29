public class Main {

    public static void main(String[] args) {

        System.out.println("Is one of the parameters is in range 13(inclusive) - 19(inclusive)? " +
                TeenNumberChecker.hasTeen(12, 129, 19));

        System.out.println("Is one of the parameters is in range 13(inclusive) - 19(inclusive)? " +
                TeenNumberChecker.hasTeen(23, 45, 30));

        System.out.println("Is one of the parameters is in range 13(inclusive) - 19(inclusive)? " +
                TeenNumberChecker.hasTeen(15, 99, 52));

        System.out.println("Is parameter is in range 13(inclusive) - 19(inclusive)? " +
                TeenNumberChecker.isTeen(15));

        System.out.println("Is parameter is in range 13(inclusive) - 19(inclusive)? " +
                TeenNumberChecker.isTeen(19));

        System.out.println("Is parameter is in range 13(inclusive) - 19(inclusive)? " +
                TeenNumberChecker.isTeen(9));
    }
}
