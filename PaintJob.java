public class PaintJob {

    public static void main(String[] args){
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double totalArea = width * height;
        int numberOfBucketsNeeded = 0;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            numberOfBucketsNeeded = -1;
        } else {
            numberOfBucketsNeeded = (int) (Math.ceil(totalArea / areaPerBucket)) - extraBuckets;
        }
        return numberOfBucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        double totalArea = width * height;
        int numberOfBucketsNeeded = 0;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            numberOfBucketsNeeded = -1;
        } else {
            numberOfBucketsNeeded = (int) (Math.ceil(totalArea / areaPerBucket));
        }
        return numberOfBucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        int bucketsNeeded = 0;

        if(area <= 0 || areaPerBucket <= 0){
            bucketsNeeded = -1;
        } else {
            bucketsNeeded = (int) Math.ceil(area / areaPerBucket);
        }
        return bucketsNeeded;
    }
}
