package Section4;

public class DecimalComparator {
    public static void main (String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.125, 3.124));
    }

    public static boolean areEqualByThreeDecimalPlaces(double nr1, double nr2) {
        if(nr1==0&&nr2==0) return true;
        else {
            int nr1Int = (int) (nr1 * 1000);
            int nr2Int = (int) (nr2 * 1000);
            if (nr1Int == nr2Int) return true;
            else return false;
        }
    }
}
