package org.example.array;

public class MinSubArrayLen {
//  209. Minimum Size Subarray Sum
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(11, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, add = 0, index = nums.length+1;
        while(j < nums.length){
            add += nums[j];
            while (add >= target) {
                index = Math.min(index, j - i + 1);
                add -= nums[i++];
            }
            j++;
        }
        return index == nums.length+1 ? 0 : index;
    }
}
