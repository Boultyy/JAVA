package com.java;

import java.util.Arrays;

public class KK_07_Q4 {
    public static void main(String[] args) {
        // FIND FIRST AND LAST POSITION OF ELEMENT IN SORTED ARRAY// VERY VERY VERY TOUGH AND IMPORTANT QUESTION
     //   here  the start=mid+1 not end =mid-1 right  as target 7>  mid=5

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        KK_07_Q4 obj = new KK_07_Q4(); // create object
        int[] ans = obj.searchRange(nums, target);

        System.out.println(Arrays.toString(ans));


    }
    public  int[] searchRange(int[] nums, int target){

        int[] ans= {-1,-1};
            //check for first occurrence of target first
            int start= search(nums, target, true);
            int end=  search(nums, target, false);

            ans[0]= start;
            ans[1]= end;
            return ans;

    }
            // THIS FUNCTION JUST RETURNS THE INDEX VALUE OF TARGET
            int search(int[] nums, int target, boolean findStartIndex){
                int ans=-1;
                int start =0;
                int end= nums.length-1;

                while (start<=end){
                    int mid= start+(end-start)/2;
                    if (target<nums[mid]){
                        end=mid-1;
                    } else if (target>nums[mid]) {
                        start=mid+1;
                    }else {
                        // potential ans found
                        ans=mid;
                        if (findStartIndex==true) {
                            end=mid-1;
                        }else {
                            start=mid+1;
                        }
                    }
                }
         return ans;

    }
}
