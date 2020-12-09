package Section5;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(22,-2,10));
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (n1 < 10 || n1 > 1000 || n2 < 10 || n2 > 1000 || n3 < 10 || n3 > 1000) return false;
        int n1LastDigit = n1%10;
        int n2LastDigit = n2%10;
        int n3LastDigit = n3%10;
        return n1LastDigit == n2LastDigit || n2LastDigit == n3LastDigit || n1LastDigit == n3LastDigit;
    }

    public static boolean isValid (int n1){
        return n1>=10&&n1<=1000;
    }
}
