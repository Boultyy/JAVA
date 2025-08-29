package com.java;

public class KK_07_Q5_Wquestion {
    public static void main(String[] args) {
        //position of an element in a sorted array of infinite numbers//
        int[] arr={3,5,7,9,10,90,100,130,140,160,170,200,210,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,410,420,430,440,450,460,470,480,490,500,510,520,530,540,550,560};
        int target=270;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr, int target){
        //first find the range
        // first start with a box of size 2
        int start = 0;
        int end=1;

        // condition for target to lie in the range
        while(target> arr[end]){
            int newStart= end+1;
            //this is my new start
            //double the box value
            //end= previous end + sizeofbox*2
            end = end+(end-start+1)*2;
            start =newStart;
        }
        return binarySearch(arr,target,start, end);

    }
    static int binarySearch(int[] arr, int target, int start,int end){
        while(start<=end){
            //find middle element
            //int mid = (start+end)/2;
            int mid= start + (end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
