package com.java;

import java.util.Arrays;

public class KK_05_part03_PassArrayInFunction {
    public static void main(String[] args) {
    int[] nums= {3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

// in arrays swapping is possible. arrays are mutable in java. objects can be changed

    static void change (int[] arr){
        arr[0]=99;
    }
}
