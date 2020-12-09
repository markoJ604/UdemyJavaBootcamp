package Section5;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,5));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int greatestDivisor = 0;
        if (first < second) {
            for (int i = first; i > 0; i--) {
                if (first % i == 0) {
                    if (second % i == 0) {
                        greatestDivisor = i;
                        break;
                    }
                }
            }
        }
        if (first > second) {
            for (int i = second; i > 0; i--) {
                if (second % i == 0) {
                    if (first % i == 0) {
                        greatestDivisor = i;
                        break;
                    }
                }
            }
        }
        return greatestDivisor;
    }
}
