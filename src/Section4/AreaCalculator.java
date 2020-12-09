package Section4;

public class AreaCalculator {

    private static final double PI_CONSTANT = Math.PI;

    public static double area (double radius) {
        if(radius<0) return -1.0;
        return radius*radius*PI_CONSTANT;
    }

    public static double area (double x, double y) {
        if(x<0||y<0) return -1.0;
        return x*y;
    }
}
