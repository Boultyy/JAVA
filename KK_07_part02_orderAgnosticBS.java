package com.java;

public class KK_07_part02_orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr= {87894,4567,2325,1164,784,654,348,256,202,189,100,5,0};
        int target= 348;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end = arr.length -1;

        //find whether array is sorted in ascending or descending
        boolean isAsc;
        if (arr[start]< arr[end]) {
            isAsc = true;
        } else {
            isAsc= false;
        }

        while (start<=end){
//            int mid = (start+end)/2; but this is not a very good method as this may cause the int range to exceed beyond.
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
            if (target < arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }
            else {
                if (target> arr[mid]){
                    end=mid-1;
                } else if (target<arr[mid]) {
                    start=mid+1;
                }
              }
            }

        }
        return -1;
    }
}
