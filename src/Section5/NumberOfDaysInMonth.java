package Section5;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2018));
        System.out.println(getDaysInMonth(2,2018));
    }

    public static boolean isLeapYear (int year ) {
        if(year < 1 || year > 9999) return false;
        else if (year%4==0){
            if(year%100==0){
                return year % 400 == 0;
            } else return true;
        } else return false;
    }

    public static int getDaysInMonth (int month, int year) {
        int days = 0;
        if(month<1||month>12) return -1;
        if (year < 1 || year > 9999) return -1;
        if (isLeapYear(year)) {
            days = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 29;
                default -> -1;
            };
        } else if (!isLeapYear(year)) {
            days = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 29;
                default -> -1;
            };

        }
        return days;
    }
}
