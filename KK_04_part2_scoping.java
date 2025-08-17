package com.java;

public class KK_04_part2_scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

         //   System.out.println(num); // won't work
      //  System.out.println(marks); // won't work

        {
            // int a = 55;   // won't work, already initialized outside the block in the same method, hence you cannot initialize again.
            //        a=78;
            // System.out.println(a); // works
            //  int c = 98;
            //      System.out.println(c); // works

        }

        //   System.out.println(c); // won't work     .... in short for block scoping, variables initialized in block will work only inside the block.
        // System.out.println(a); // works
                                                  // LOOP SCOPING //

//
//        for (int i =0; i<5; i++){
//            System.out.println(i);
//           int a = 54; // won't work, already initialized outside the block in the same method, hence you cannot initialize again.
//        }
    //    System.out.println(i); // won't work


    }

                                                    // METHOD SCOPING //

    static void random (int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

        //System.out.println(int a);  // won't work
        //System.out.println( int b); // won't work

        }
    



}








