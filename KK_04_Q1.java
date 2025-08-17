package com.java;
import java.util.Scanner;
public class KK_04_Q1 {
    public static void main(String[] args) {
        System.out.println("ENTER A NUMBER");
        Scanner in = new Scanner((System.in));
        ans();
//        boolean ans = isPrime(n);





    }

                               // MY WAY //
    static void ans() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("neither prime nor composite");
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("not prime number");
            }
            c++;
            {
                if (c * c > n) {
                    System.out.println("prime");
                }
            }

        }
    }



                            // KUNAL'S WAY //

//    static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//
//        int c = 2;
//        while (c * c <= n) {
//            if (n % c == 0) {
//                return false;
//            }
//            c++;
//        }
//        if (c *c >n  ){
//            return  true;
//        }
//return false;
//    }


}
