package com.java;
import java.util.Scanner;
public class KK_02_questions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // QUESTION : 01 FIND THE MAXIMUM NUMBER //

//    System.out.println("enter value a");
//    int a = input.nextInt();
//
//    System.out.println("enter value b");
//    int b = input.nextInt();
//
//    System.out.println("enter value c");
//    int c = input.nextInt();
//
//    int max = a;
//    if (b> max) {
//        max= b;
//    }
//    if (c> max) {
//        max = c;
//    }
//    System.out.println("maximum value is " +max);


        // THERE  IS ONE MORE WAY TO SOLVE THIS QUESTION USING MATH MAX METHOD //

//        int max = Math.max(c,Math.max(a,b));
//        System.out.println(max);
//


        // QUESTION :02 CASECHECK //

//        System.out.println("enter the alphabet");
//        char ch = input.next().trim().charAt(0);
//
//        if (ch>='a' && ch<='z') {
//            System.out.println("lowercase");
//        } else {
//            System.out.println("Uppercase");
//        }
//        System.out.println(ch);


        //    QUESTION :03   FIND THE NTH FIBONACCI NUMBER //

//        int n = input.nextInt();
//
//        if (n == 0) {
//            System.out.println("The 0th Fibonacci number is: 0");
//            return;
//        }
//        if ( n== 1) {
//            System.out.println("The 1st Fibonacci number is: 1");
//            return;
//        }
//
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while (count <= n) {
//            int temp = b;
//            b = a+b;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);


        // TO UNDERSTAND TEMP VARIABLE //
       // int a = 5;
        //int b = 10;

 //We need a temporary variable to hold one of the values during the swap.
   //     int temp = a; // Store the value of a in temp
     //   a = b;        // Assign the value of b to a
       // b = temp;     // Assign the value of temp (original a) to b

    //    System.out.println("a: " + a); // a is now 10
    //    System.out.println("b: " + b); // b is now 5

//         QUESTION :04 COUNTING OCCURRENCES ( goood question )
//        int n = 4553556;
//        int count = 0;
//        while (n >0) {
//           int rem = n % 10;
//           if (rem==3) {
//               count++;
//           }
//           n/=10; //
//        }
//        System.out.println(count);

        // QUESTION :05 REVERSE ORDER QUESTION ( veryyyyy goooood question )

//int n = 854684;
//int ans = 0;
//while (n>0){
//    int rem = n % 10;
//    n /= 10;
//
//ans = ans * 10 + rem;
//        }
//        System.out.println(ans);

        // QUESTION :06 CALCULATOR PROGRAM //
//        int ans = 0;
//        while (true) {
//            // take the operator as input //
//            System.out.print("Enter the operator");
//            char op = input.next().trim().charAt(0);
//
//            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//                System.out.print("enter two numbers:");
//                int num1 = input.nextInt();
//                int num2 = input.nextInt();
//
//                if (op == '+') {
//                    ans = num1 + num2;
//                }
//                if (op == '-') {
//                    ans = num1 - num2;
//                }
//                if (op == '*') {
//                    ans = num1 * num2;
//                }
//                if (op == '/') {
//                    if (num2 != 0) {
//                        ans = num1 / num2;
//                    }
//                }
//                if (op == '%') {
//                    ans = num1 % num2;
//                }
//            } else if (op == 'x' || op == 'X')  {
//                System.out.println("no result");
//                break;
//            } else {
//                System.out.println("invalid operation");
//            }
//                System.out.println(ans);
            }
        }




