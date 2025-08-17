package com.java;
import java.util.Arrays;
public class KK_04_part4_varargs {
    public static void main(String[] args) {
       potato(2,58,44,50,69,699,6999);
        multiple(2,8,"kunal" ,"amreshwar", "kushagra", "esha");
    }
    

    static void potato (int ...v){
        System.out.println(Arrays.toString (v));
    }



    static void multiple( int a, int b,  String ...v ){
        System.out.println(Arrays.toString (v));
        System.out.println(a);
        System.out.println(b);

    }

}
