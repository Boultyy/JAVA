package com.java;
import java.util.Arrays;
public class KK_06_Q3 {
    public static void main(String[] args) {
                    // very important question!!!!!//


        int[][] arr= {
                {23, 54, 67},
                {12, 56, 75, 5636},
                {684, 54, 86, 135},
                {56, 98}
        };
        int target= 75;
        int[] ans= search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target ){
                for (int row =0; row<arr.length;row++){
                    for (int col=0; col<arr[row].length; col++){
                        if (arr[row][col]==target){
                            return new int[] {row,col};
                        }
                    }
                }
        return null;
    }

    }

