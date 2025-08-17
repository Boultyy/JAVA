package com.java;
import java.util.Scanner;
public class Important_probs02 {
    public static void main(String[] args) {




        // Input from user
        Scanner in = new Scanner(System.in);



        System.out.print("Enter a number N: ");
        int N = in.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumEven += i; // Even number
            } else {
                sumOdd += i;  // Odd number
            }
        }

        // Output the results
        System.out.println("Sum of even numbers from 1 to " + N + ": " + sumEven);
        System.out.println("Sum of odd numbers from 1 to " + N + ": " + sumOdd);


    }
}


