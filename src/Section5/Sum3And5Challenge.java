package Section5;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        for (int n = 1; n <= 1000; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                sum += n;
                System.out.println(n);
                i++;
            }
            if (i == 5) break;
        }
        System.out.println(sum);
    }
}
