package Section4;

public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(-2);
    }

    public static long toMilesPerHour(double kilometresPerHour) {
        if (kilometresPerHour < 0) return -1;
        long milesPerHour = Math.round(kilometresPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometresPerHour + " km/h = " + toMilesPerHour(kilometresPerHour) + " mi/h");
        }
    }
}
