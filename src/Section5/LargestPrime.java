package Section5;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        if (number < 10) {
            for (int i = 2; i <= 7; i += 2) {
                if (number % i == 0) return number;
            }
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                number = number / i;
                System.out.println(number);
                for (int j = 2; j < number / 2; j++) {
                    while (number % j == 0) {
                        if (number == 2) break;
                        number = number / j;
                        System.out.println(number);

                    }
                }
            }
        }
        return number;
    }
}
