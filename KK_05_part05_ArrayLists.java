package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class KK_05_part05_ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // syntax
        ArrayList<Integer> list = new ArrayList<>(2);
//        list.add(87);
//        list.add(7);
//        list.add(467);
//        list.add(6447);
//        list.add(6753);
//        list.add(67513);
//        list.add(673515);
//        list.add(676484);
//        list.add(67486);
//        list.add(6715);
//        list.add(67153);
//
//        System.out.println(list);
//        list.set(0, 57);
//        list.remove(4);
//        System.out.println(list);

        //input
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        // get item at any index.
        for (int i=0; i<5; i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here.
        }
        System.out.println(list);





    }

}
