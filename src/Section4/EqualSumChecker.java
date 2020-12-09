package Section4;

public class EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1,1,1);
    }

    public static boolean hasEqualSum (int sum1, int sum2, int sum3) {
        return sum1 + sum2 == sum3;
    }
}
