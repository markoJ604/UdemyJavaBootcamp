package Section5;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1233456));
    }
    public static int getEvenDigitSum (int number) {
        if(number<0) return -1;
        int sum = 0;
        while(number>1){
            if((number%10)%2==0) sum+=number%10;
            number = number / 10;
        }
        return sum;
    }
}
