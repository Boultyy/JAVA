package com.java;



public class KK_06_Q4 {
    public static void main(String[] args) {
        // count the digits and return numbers with even number of digits// ANOTHER VERY GOOD QUESTION
                int [] nums={18,124,9, 1764,98,1};
        System.out.println(FindNumbers(nums));

    }
    static int FindNumbers(int[] nums){
        int count=0;
         // enhanced for loop:  The enhanced for loop (also called the “for-each loop”)
            // is a simplified way to iterate over the elements of arrays or collections in Java.
//            Rather than using indices, it directly gives you each element, one by one.
//            How does it work?
//
//            int n : nums means:
//
//            For each element (n) in the array nums,
//
//            Do the following...
//
//            So if nums is {18, 124, 9, 1764, 98, 1},
//            the loop will process:
//
//            n = 18 (first pass)
//
//            n = 124 (second pass)
//
//            n = 9 (third pass)
//
//            n = 1764 (fourth pass)
//
//            n = 98 (fifth pass)
//
//            n = 1 (sixth pass)
            for (int n:nums) {
            if (even(n)){
                count++;
            }

        }
        return count;
    }

     static boolean even(int num) {
        int numberOFdigits =digits(num);
        if (numberOFdigits%2==0){
            return true;
        }

         return false;
    }


    static int digits (int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
    }


