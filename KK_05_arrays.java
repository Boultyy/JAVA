package com.java;

public class KK_05_arrays {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll number:
    //    int[] rnos= new int[5];
        // or directly
    //    int[] rnos2= {23, 12,43,23,11};


      int[] ros; // declaration of array, ros is getting defined in the stack
        ros = new int[5]; // initialization: actually here object is being created in the memory (heap)

        System.out.println(ros[1]);

      String[] name = new String[8];
        System.out.println(name[4]);

    }
}
