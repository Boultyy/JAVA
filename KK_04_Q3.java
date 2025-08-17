package com.java;

import java.util.Scanner;
public class KK_04_Q3 {
    // print all the 3 digits armstrong numbers
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        // kunal //
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

}

                              // without methods //

// static void ans() {
//        int m, r, s, d;
//        Scanner in= new Scanner(System.in);
//        int n = in.nextInt();
//        r=n;
//
//        for (int i = 100; i < 1000; i++) {
//            r = i;s=0;d=i;
//            while (r > 0) {
//                m = r % 10;
//                r = r / 10;
//                s = s + m * m * m;
//            }
//            if (d == s)
//                System.out.println(i);
//            else
//                continue;
//        }