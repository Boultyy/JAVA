package com.java;

public class KK_07_Q2 {
    public static void main(String[] args) {

        // FLOOR OF A NUMBER // return the index of the greatest number <= target
        // MAKE SURE TO WATCH ISKA EXPLAINATION ACCHE SE WAPAS//
        int[] arr={2,4,6,8,10,12,14};
        int target= 7;
        int Floor = BinarySearch(arr,target);
        System.out.println(Floor);

    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid=start+ (end-start)/2;
            if (arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
        }
        return end;
    }
}
