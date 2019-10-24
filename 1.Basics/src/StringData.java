public class StringData {
    public static void main(String[] args) {
        
        //Strings are immutable.  Immutable simply means unmodifiable or unchangeable.
        //Once string object is created its data or state can't be changed but a new string object is created.
        
        String stringValue = "Some text";
        System.out.println("stringValue is " + stringValue);
        System.out.println("stringValue is " + stringValue);
        stringValue = stringValue + ". \u00A9 2019";
        System.out.println("stringValue is " + stringValue);
        String numberString = "41.12";
        numberString = numberString + "32.124";
        System.out.println("numberString is " + numberString);
        String lastString = "24";
        int intValue = 36;
        lastString = lastString + intValue;
        System.out.println("lastString is " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is " + lastString);

    }
}
