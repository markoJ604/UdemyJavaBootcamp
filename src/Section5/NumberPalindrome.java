package Section5;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int number) {
        int startingNumber = number;
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse += lastDigit;
            reverse = reverse * 10;
            number /= 10;
        }
        reverse = reverse / 10;
        return startingNumber == reverse;
    }
}
