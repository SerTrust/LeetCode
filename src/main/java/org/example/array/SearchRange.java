package org.example.array;

import java.util.Arrays;

public class SearchRange {

    public static void main(String[] args) {
        int[] nums = {2,2};
        int[] result = searchRange(nums, 2);
        System.out.println(Arrays.asList(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start<=end){
            int median = start + (end-start)/2;
            if (nums[median] == target){
                int first = median,second = median;
                while(nums.length-1 > second)
                    if (nums[second+1] == target) second += 1;
                    else break;
                while(first > 0)
                    if (nums[first-1] == target) first -= 1;
                    else break;
                return new int[]{first, second};
            }
            if (nums[start] <= nums[median]){
                if(nums[start] <= target && target < nums[median]){
                    end = median-1;
                }else{
                    start = median+1;
                }
            }else{
                if(nums[median] < target && target <= nums[end]){
                    start = median+1;
                }else{
                    end = median-1;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
