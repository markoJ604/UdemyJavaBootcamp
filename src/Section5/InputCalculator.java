package Section5;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner in = new Scanner(System.in);
        int sum = 0, count = 0, number;
        long avg;
        while(true){
//            System.out.println("Enter a number:");
            boolean isAnInt = in.hasNextInt();

            if(isAnInt){
                number = in.nextInt();
                sum+=number;
                count++;
            } else {
                break;
            }
        }
        if(count==0){
            avg = 0;
        } else {
            avg = Math.round((double)sum/count);
        }
        System.out.println("SUM = "+sum+" AVG = "+avg+"");
    }
}
