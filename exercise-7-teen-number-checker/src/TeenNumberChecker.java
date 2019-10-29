public class TeenNumberChecker {

    public static boolean hasTeen(int firstParameter, int secondParameter, int thirdParameter) {

        return (firstParameter >= 13 && firstParameter <= 19)
                || (secondParameter >= 13 && secondParameter <= 19)
                || (thirdParameter >= 13 && thirdParameter <= 19);
    }

    public static boolean isTeen(int parameter) {

        return parameter >= 13 && parameter <= 19;
    }
}
