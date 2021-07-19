package org.example.array;

import java.util.*;

public class ThreeSum {
//  15. 3Sum
    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int target = 0 - nums[i], x = i + 1, y = nums.length - 1;
            while (x < y) {
                if (nums[x] + nums[y] == target) {
                    List<Integer> arrayList = new ArrayList<>();
                    arrayList.add(nums[i]);
                    arrayList.add(nums[x]);
                    arrayList.add(nums[y]);
                    list.add(arrayList);
                    y--;x++;
                    while (x < y && nums[x] == nums[x - 1]) {
                        x++;
                    }
                    while (x < y && nums[y] == nums[y + 1]) {
                        y--;
                    }
                }else if(nums[x] + nums[y] > target){
                    y--;
                }else{
                    x++;
                }
            }
        }
        return list;
    }
}
