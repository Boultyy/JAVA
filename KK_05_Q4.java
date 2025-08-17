package com.java;

import java.util.Arrays;

public class KK_05_Q4 {
    public static void main(String[] args) {
        // reversing an array
        // GOOD AND TOUGH
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Reverse the array in-place
        reverse(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
