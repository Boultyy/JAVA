package com.java;
import java.util.Scanner;
public class Important_probs01 {
    public static void main(String[] args) {
        // FACTORIAL PROBLEM //
        System.out.println("enter a number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int f = 1;
        for (int i = a; i > 0; i--) {
            f = f * i;
        }
        System.out.println("factorial of " + a + "is: " + f);
    }


}







