package Section5;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int reverseNumber = reverse(number);
        int count1 = getDigitCount(number);
        int count2 = getDigitCount(reverseNumber);
        if(reverseNumber==0) System.out.println("Zero");
        while (reverseNumber > 0) {
            int lastDigit = reverseNumber % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                default -> System.out.println("OTHER");
            }
            reverseNumber = reverseNumber / 10;
        }
        for (int i = 0; i < count1 - count2; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse += lastDigit;
            reverse = reverse * 10;
            number /= 10;
        }
        reverse = reverse / 10;
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int count = 0;
        do {
            number = number/10;
            count++;
        } while(number>0);
        return count;
    }
}
