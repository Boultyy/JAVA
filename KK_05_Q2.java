package com.java;

import java.util.Arrays;

public class KK_05_Q2 {
    public static void main(String[] args) {
        // swap 2 indexes of an array.
        int[] arr= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1,5);
    }
    static void swap(int[] arr, int index1 ,int index5 ){


        int temp= arr[1];
        arr[1]=arr[5];
        arr[5]= temp;

        System.out.println(Arrays.toString(arr));


    }
}
