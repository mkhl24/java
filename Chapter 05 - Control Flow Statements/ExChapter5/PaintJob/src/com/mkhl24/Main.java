package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        } else {
            double n = width * height / areaPerBucket;
            int number = (int) (width * height / areaPerBucket);

            if (number == n) {
                return (number - extraBucket);
            } else {
                return (number + 1 - extraBucket);
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double numberOfBuckets = ((width * height) / areaPerBucket);
            return (int) Math.ceil(numberOfBuckets);
        }
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double numberofBuckets = area / areaPerBucket;
            return (int) Math.ceil(numberofBuckets);
        }
    }
}
