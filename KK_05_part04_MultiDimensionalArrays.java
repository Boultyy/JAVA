package com.java;

import java.util.Scanner;

public class KK_05_part04_MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

//        int [][] arr= new int [3][]; // adding number of columns is not mandatory but rows is definitely mandatory//


//        int[][]arr2D={
//                {1,2,3}, //0th index
//                {4,5},   //1st index
//                {6,7,8,9}//2nd index-> arr2D[2] = 6,7,8,9
//        };

        // input

        int[][] arr2D= new int[3][3];
        for (int row =0; row< arr2D.length;row++){
            for (int col=0; col<arr2D[row].length; col++){
                arr2D[row][col]= in.nextInt();

            }
        }
        //  output

        for (int row =0; row<arr2D.length;row++){
            for (int col=0; col<arr2D[row].length; col++){
                System.out.println(arr2D[row][col] + " ");

            }
            System.out.println();
        }


    }
}
