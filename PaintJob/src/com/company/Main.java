package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(3.5,1.5));
        System.out.println(getBucketCount(6.26,2.2));
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height,double areaPerBucket,int extraBuckets){

        double area;
        double remainArea;

        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0))
            return -1;
        else{

            area = width * height;
            remainArea = (area) - (extraBuckets*areaPerBucket);
            return (int) Math.ceil(remainArea/areaPerBucket);

        }
    }


    public static int getBucketCount(double width, double height, double areaPerBucket){
        double area;

        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0))
            return -1;
        else{

            area = width * height;
            return (int) Math.ceil(area/areaPerBucket);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if((area <= 0) || (areaPerBucket <= 0))
            return -1;
        else{
            return (int) Math.ceil(area/areaPerBucket);
        }

    }
}
