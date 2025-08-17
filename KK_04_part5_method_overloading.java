package com.java;

public class KK_04_part5_method_overloading {
    public static void main(String[] args) {
    fun(54);
    fun("amreshwar");
    }
    static  void  fun(int a){
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
// When two or more functions have same name but different arguments.
// THIS WHOLE THING HAPPENS AT COMPILE TIME
