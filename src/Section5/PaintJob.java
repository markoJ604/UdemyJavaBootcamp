package Section5;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        double area = height * width;
        int numberOfBuckets = (int) Math.ceil((area - extraBuckets * areaPerBucket) / areaPerBucket);
        return numberOfBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        double area = height * width;
        int numberOfBuckets = (int) Math.ceil(area / areaPerBucket);
        return numberOfBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;
        int numberOfBuckets = (int) Math.ceil(area / areaPerBucket);
        return numberOfBuckets;
    }
}
