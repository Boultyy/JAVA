package com.java;
public class KK_07_Q3_issue {
    public static void main(String[] args) {
        // FIND SMALLEST LETTER GREATER THAN TARGET AND THE LETTERS WRAP AROUND//
        char [] arr={'e','f','h', 'j'};
        char target= 'f';
        char Ans= BinarySearch(arr,target);
        System.out.println(Ans);

    }

    static char BinarySearch(char[] arr,char target ){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]>target){
                end= mid-1;
            } else if (arr[mid]<target) {
                 start=mid+1;

            }
        }
        return arr[start%arr.length];
    }
}
