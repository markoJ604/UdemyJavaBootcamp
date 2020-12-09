package Section4;

import java.util.Scanner;

public class MegaBytesConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("\nMB to KB, or KB to MB? (1 or 2)\nTo exit press 0");
            switch (in.nextInt()) {
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.println("Input megabytes to convert to kilobytes:");
                    printMegaBytesToKiloBytes(in.nextInt());
                }
                case 2 -> {
                    System.out.println("Input kilobytes to convert to megabytes:");
                    printMegaBytesAndKiloBytes(in.nextInt());
                }
                default -> System.out.println("Try again");
            }
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0){
            System.out.println("0 KB = 0 MB and 0 KB");
        } else {
            int megaBytes = kiloBytes / 1024;
            int restKB = kiloBytes % (megaBytes * 1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + restKB + " KB");
        }
    }

    public static void printMegaBytesToKiloBytes (int megaBytes){
        if (megaBytes < 0) {
            System.out.println("Invalid Value");
        } else if (megaBytes == 0){
            System.out.println("0 MB = 0 KB");
        } else {
            int kiloBytes = megaBytes * 1024;
            System.out.println(megaBytes + " MB = " + kiloBytes + " KB");
        }
    }
}
