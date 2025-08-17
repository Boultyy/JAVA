package com.java;
import java.nio.file.LinkPermission;
import java.util.Scanner;
public class KK_04_Q2 {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
        //int sol = ans();
        //System.out.println(ans());
        ans();
    }


    static boolean  ans(){
        int m,r,s = 0;
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
         r=n;


        while ( n>0){
             m = n%10;
             n = n/10;
             s= s+ m*m*m;
        }
        if(r==s)
        System.out.println("yes");
        else
        System.out.println("no");
       return false;
    }



}
