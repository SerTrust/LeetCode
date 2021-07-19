package org.example.array;

public class RemoveElement {
//  27. Remove Element
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[position++] = nums[i];
            }
        }
        return position;
    }
}
