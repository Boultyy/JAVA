package com.java;

public class KK_07_Q7 {
    public static void main(String[] args) {
        //FIND IN MOUNTAIN ARRAY//
        int [] arr= {1,2,3,5,3,1};
        int target = 2;   int finalAns= search(arr,target);
        System.out.println(finalAns);
    }

     static int search(int[] arr, int target) {
         int peak = peakIndexInMountainArray(arr);
         int firstTry = orderAgnosticBS(arr, target, 0, peak);
         if (firstTry != -1) {
             return firstTry;
         }
            return orderAgnosticBS(arr, target,peak+1, arr.length-1);
     }

    public static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if (arr[mid] < arr[mid+1]) {
                start=mid+1;
            }
            else {
                end =mid;
            }
        }
        return end;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
