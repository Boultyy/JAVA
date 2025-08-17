package com.java;

import java.util.Arrays;

public class KK_05_Q1 {
    public static void main(String[] args) {
        // swap two arrays
        int[] arr1 = {1,2,3,4};
        int[] arr2= {4,3,2,1};
        System.out.println( Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("the new arr2 is ");
        swap(arr1, arr2 );
    }

    static void swap(int [] arr1, int[] arr2) {
        int [] temp;
       temp=  arr1;
       arr1=  arr2;
       arr2= temp;
        System.out.println(Arrays.toString(arr2));


    }
}
