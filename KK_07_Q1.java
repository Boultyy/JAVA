package com.java;

public class KK_07_Q1 {
    public static void main(String[] args) {
        // CEILING OF A NUMBER // return the index of the smallest number >= target
        // MAKE SURE TO WATCH ISKA EXPLAINATION ACCHE SE WAPAS//
        int[] arr={2,4,6,8,10,12,14};
        int target= 7;
        int Ceiling= BinarySearch(arr,target);
        System.out.println(Ceiling);

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
        return start;
        }
    }
