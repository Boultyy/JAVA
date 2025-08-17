package com.java;

public class KK_06_LinearSearch {
    public static void main(String[] args) {
        // CODE OF LINEAR SEARCH //
        int[] nums={23,45,1,2,8,19,-3,16,-11,22};
        int target = 19;
        boolean ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static boolean linearSearch(int[]arr, int target){
        if(arr.length==0){
            return false;
        }
        // run a for loop
        for (int index=0;index<arr.length; index++){
        // check for element at every index if it is= target
            int element = arr[index];
            if (element== target){
                return true;
            }
        }
        return false;
    }
}
