public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println("Is 1221 Palindrome? " + isPalindrome(1221));
        System.out.println("Is 122 Palindrome? " + isPalindrome(122));
        System.out.println("Is -1221 Palindrome? " + isPalindrome(-1221));
        System.out.println("Is 33 Palindrome? " + isPalindrome(33));
    }

    private static boolean isPalindrome(int number) {
        
        int reverseNumber = 0;
        int temp = number;

        while (temp != 0) {
            reverseNumber *= 10;
            reverseNumber += temp % 10;
            temp /= 10;
        }

        return number == reverseNumber;
    }
}
