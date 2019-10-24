public class PrimitiveTypes {
    public static void main(String[] args) {

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + minIntValue);
        System.out.println("Integer Max Value = " + maxIntValue);

        //overflow occurs when we assign such a value to a variable which is more than the maximum permissible value.
        System.out.println("Busted Max value = " + (maxIntValue + 1));

        //underflow occurs when we assign such a value to a variable which is less than the minimum permissible value.
        System.out.println("Busted Min value = " + (minIntValue - 1));

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + minByteValue);
        System.out.println("Byte Max Value = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + minShortValue);
        System.out.println("Short Max Value = " + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + minLongValue);
        System.out.println("Long Max Value = " + maxLongValue);

        byte byteValue = (byte) 16;
        short shortValue = 34;
        int intValue = 70;

        long longValue = 50000 + 10 * (byteValue + shortValue + intValue);
        System.out.println("Long value = " + longValue);

        //cast - convert a number from one type to another
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("Short value = " + shortTotal);
    }
}
