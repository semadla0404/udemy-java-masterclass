public class PaintJob {

    static public int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        // ((width * height) / areaPerBucket) - extraBuckets
        int bucketsNeeded = (int) (Math.ceil(((width * height) / areaPerBucket) - extraBuckets));
        return bucketsNeeded;
    }

    static public int getBucketCount(double width, double height, double areaPerBucket) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        // ((width * height) / areaPerBucket)
        int bucketsNeeded = (int) (Math.ceil((width * height) / areaPerBucket));
        return bucketsNeeded;
    }

    static public int getBucketCount(double area, double areaPerBucket) {

        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        // ((width * height) / areaPerBucket)
        return (int) (Math.ceil(area / areaPerBucket));
    }
}
