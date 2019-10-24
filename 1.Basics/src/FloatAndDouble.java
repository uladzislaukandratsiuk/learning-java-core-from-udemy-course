public class FloatAndDouble {
    public static void main(String[] args) {

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min value = " + minFloatValue);
        System.out.println("Float Max value = " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min value = " + minDoubleValue);
        System.out.println("Double Max value = " + maxDoubleValue);

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;

        System.out.println("Integer value = " + intValue);
        System.out.println("Float value = " + floatValue);
        System.out.println("Double value = " + doubleValue);

        double poundValue = 53d;
        double oneKilogramInPounds = 0.45359237d;
        double kilogramValue = poundValue * oneKilogramInPounds;
        System.out.println("Kilogram value = " + kilogramValue);

        double bigDoubleNumber = 421_634.2_512_230d;
        System.out.println(bigDoubleNumber);
    }
}
