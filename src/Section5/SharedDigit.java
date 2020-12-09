package Section5;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 99));
    }

    public static boolean hasSharedDigit(int n1, int n2) {
        if ((n1 >= 10 && n1 <= 99) && (n2 >= 10 && n2 <= 99)) {
            int n1LastDigit = n1 % 10;
            int n1FirstDigit = n1 / 10;
            int n2LastDigit = n2 % 10;
            int n2FirstDigit = n2 / 10;
            if (n1FirstDigit == n2LastDigit || n1FirstDigit == n2FirstDigit || n2FirstDigit == n1LastDigit || n1LastDigit == n2LastDigit)
                return true;
        }
        return false;
    }
}
