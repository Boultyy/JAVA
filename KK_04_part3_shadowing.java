package com.java;

public class KK_04_part3_shadowing {
   static int y =69;  // this will be shadowed at line 8
   public static void main(String[] args) {
       System.out.println(y); // 69
       int y = 40; // the class variable at line 4 is shadowed by this
       System.out.println(y); // 40
       wow();

    }
    static void wow(){
        System.out.println(y);
    }
}
