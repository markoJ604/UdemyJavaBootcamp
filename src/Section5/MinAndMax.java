package Section5;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Enter number:");
            boolean isAnInt = in.hasNextInt();

            if (isAnInt) {
                int number = in.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            in.nextLine();
        }
        System.out.println(min);
        System.out.println(max);
        in.close();
    }
}
