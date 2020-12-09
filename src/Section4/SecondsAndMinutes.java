package Section4;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(560));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";
        }
        int hour = minutes / 60;
        minutes = minutes % 60;
        return hour + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "Invalid Value";
        int minutes = seconds / 60;
        seconds = seconds%60;

        return getDurationString(minutes, seconds);
    }
}
