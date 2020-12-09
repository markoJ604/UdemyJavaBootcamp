package Section4;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a year:");
        System.out.println(isLeapYear(in.nextInt()));
    }

    public static boolean isLeapYear (int year ) {
        if(year < 1 || year > 9999) return false;
        else if (year%4==0){
            if(year%100==0){
                return year % 400 == 0;
            } else return true;
        } else return false;
    }
}
