package com.java;

public class KK_07_BinarySearchh {
    public static void main(String[] args) {
            int[] arr= {54,68,89,348,486,5654,68658,};
            int target= 348  ;
            int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length -1;

        while (start<=end){
//            int mid = (start+end)/2; but this is not a very good method as this may cause the int range to exceed beyond.
            int mid = start + (end - start)/2;
            
            if (target < arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid +1;
                
            }else {
                return mid;
            }

        }
        return -1;
    }

}

// FOR DESCENDING ORDER //
//target >middle
//then end=mid-1
//        target<middle
//                then start=mid+1
//
















