package org.example.array;

import java.util.Arrays;

public class SortedSquares {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.asList(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0, j = nums.length-1, position = nums.length-1;
        while(i<=j){
            if ((nums[i] * nums[i]) > (nums[j] * nums[j])){
                result[position--] = nums[i] * nums[i];
                i++;
            }else{
                result[position--] = nums[j] * nums[j];
                j--;
            }
        }
        return  result;
    }
}
