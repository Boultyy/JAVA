package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class KK_05_Q3 {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        int[]arr = new int[5];
        for (int i=0;i<5;i++){
            arr[i]= in.nextInt();
        }
        for (int i=0; i<5; i++){
            System.out.println(Arrays.toString(arr));
        }

        int max = arr[0];
        for (int i=0; i<5;i++) {
            if (  max <arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);



    }

}
