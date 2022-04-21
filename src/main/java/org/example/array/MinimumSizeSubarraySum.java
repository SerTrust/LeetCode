package org.example.array;

public class MinimumSizeSubarraySum {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int target = 11;
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int temp = 0, startIndex = 0, result = nums.length+1;
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            while (temp >= target) {
                result = Math.min(i-startIndex+1, result);
                temp -= nums[startIndex++];
            }
        }
        return result == nums.length+1 ? 0 : result;
    }
}
