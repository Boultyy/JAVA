package com.java;

public class KK_06_Q2 {
    public static void main(String[] args) {
        // minimum number search//
        int[] arr={1,2,3,4,5,6,-1};
                int min = arr[0];
                for (int i=1; i<=6;i++) {
                    if (  min >arr[i]){
                        min = arr[i];
                    }

            }System.out.println(min);
        int target=min;
        for (int i = 0; i <= 6; i++) {
            if (target == arr[i]) {
                System.out.println(i);// prints index of minimum number

            }


        }



        }
    }

