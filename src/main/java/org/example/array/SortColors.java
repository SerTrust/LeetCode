package org.example.array;

import java.util.Arrays;

public class SortColors {

    //75. Sort Colors
    public static void main(String[] args) {
        int[]nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int[] colors = new int[3];
        for (int num : nums) {
            colors[num]++;
        }

        int index = 0, size = 0;
        for (int i = 0; i < colors.length; i++) {
            size += colors[i];
            for (; index < size; index++) {
                nums[index] = i;
            }
        }
    }
}
