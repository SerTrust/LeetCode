package org.example.array;

public class Search {
//  33. Search in Rotated Sorted Array
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        System.out.println(search(nums,3));
    }

    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start<=end){
            int median = start + (end-start)/2;
            if (nums[median] == target)
                return median;
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
        return -1;
    }
}
