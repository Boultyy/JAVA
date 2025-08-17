package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class KK_05_part2_arrays {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
                // ARRAY OF PRIMITIVES
        int[] arr= new int[5];
        arr[0]=24;
        arr[1]= 54;
        arr[2]=43;
        arr[3]=53;
        arr[4]=77;
        System.out.println(arr[2]);


        // input by using for loop
//
//        for(int i=0; i<arr.length; i++ )
//        {
//            arr[i]= in.nextInt();
//        }
//        for (int i=0; i< arr.length; i++)
//        {
//            System.out.println(arr[i]); // THIS FOR LOOP IS FOR PRINTING THE ARRAY
//        }

          // FOR PRINTING THE ARRYAY WITHOUT LOOP
//        System.out.println(Arrays.toString(arr));


                        // ARRAY OF OBJECTS
        String[] str= new String[5];
        for (int i=0; i<str.length;i++)
        {
            str[i]= in.next();
        }
        str[2]= "aman"; // modify //
        System.out.println(Arrays.toString(str));



    }
}
