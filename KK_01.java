package com.java;
import java.util.Scanner;
public class KK_01 {
    public static void main(String[] args) {
      //  System.out.println("Hello World, this program is made to understand basics of java structure. THIS IS THE CONTENT FROM VIDEO NUMBER 8 OF KUNAL KUSHWAHA");
 Scanner input = new Scanner(System.in);
// int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println("sum= " + sum);

//
//        float num1 = input.nextFloat();
//                float num2 = input.nextFloat();
//        float sum = num1 + num2;
//        System.out.println("sum = " + sum);

        // typecasting//
//        int num = (int)(56.999);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);  // 257%256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//        System.out.println(d);

//        byte b = 50;
//
//         b = (byte) (b * 2);
//        System.out.println(b);


//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = 0.1234;
//        double result = (f * b) + (i / c) - (d - s);
//        // float + integer - double = double
//        System.out.println((f * b) + " " + (i / c) + " " +  (d - s));
//        System.out.println(result);


        // celsius to fahrenheit converter //
        System.out.println(" Please enter temperature in celsius");
        float tempC = input.nextFloat();

       float tempF = (tempC * 9/5) + 32 ;
        System.out.println( "temperature in fahrenheit is "+ tempF+ "F" );

    }
}
