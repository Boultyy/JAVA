package com.java;



public class KK_07_Q6 {
    public static void main(String[] args) {
    // PEAK INDEX IN MOUNTAIN ARRAY //
        int[] arr={0,2,1,0};
        KK_07_Q6 obj = new KK_07_Q6(); // create object
        int ans = obj.peakIndexInMountainArray(arr);
        System.out.println(ans);


    }
        public int peakIndexInMountainArray(int[]arr){
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

}
