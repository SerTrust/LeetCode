package org.example.array;

import java.util.Arrays;

public class NextPermutation {
//  31. Next Permutation
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int i, n = nums.length;
        for (i = n-1; i > 0; i--) {
            //如果後數比前數大
            if (nums[i] > nums[i-1]){
                //從最後找有沒有比前數大的數來互換
                for (int j = n-1; j > i-1; j--) {
                    if (nums[j] > nums[i-1]){
                        int temp = nums[j];
                        nums[j] = nums[i-1];
                        nums[i-1] = temp;
                        break;
                    }
                }
                //互換完的後方數從小排到大
                Arrays.sort(nums, i, n);
                return;
            }
        }
        //如果都沒有就從小排到大
        Arrays.sort(nums);
    }
}
