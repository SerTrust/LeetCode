package org.example.array;

public class RemoveDuplicates {
//  26. Remove Duplicates from Sorted Array
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[position] != nums[i]){
                nums[++position] = nums[i];
            }
        }
        return position+1;
    }
}
