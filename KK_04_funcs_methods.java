package com.java;
import java.util.Scanner;
import java.util.Arrays;
public class KK_04_funcs_methods {
    public static void main(String[] args) {


     // sum();




//        int ans = sum2();
//        System.out.println(ans);



//        String welcome = greet();
//        System.out.println(welcome);



       Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
       int a = in.nextInt();
        System.out.println("Enter number 2: ");
       int b = in.nextInt();
       int ans = sum3(a,b);
        System.out.println(ans);



//        Scanner in = new Scanner(System.in);
//        String name = in.next();
//        String greet= welcome(name);
//        System.out.println(greet);


//        String name = "Amreshwar Singh";
//        changeName(name);
//        System.out.println(name);

//
//        int[] arr = {1,3,2,45,6};
//        change(arr);
//        System.out.println(Arrays.toString(arr));



    }

                                        // calling out a program //

   static void sum() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of both numbers is " + sum);
    }

                                      // returning a program //

    static int sum2() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }


    static String greet() {
        String greeting = "how are you";

        return greeting;
    }
                                      // passing the value of numbers when calling out the method in main()//
                                                    // parameters(numerals) //
    static int sum3(int a, int b) {
        int sum = a+b;
        return sum;
    }
                                                   // parameters (string type)//

    static String welcome (String name){

        String message = " Hello " + name;
        return message;
    }
                                                  // SWAPPINGGGG //

static void changeName (String name) {
        name = "Esha Sharma";    // due to value passing property of primitives in java, swapping didn't happen //
}


static void change(int[] nums) {

        nums[0] =99;             // swapping will happen here //
}



}

