package org.example.HashTable;

import java.util.*;

public class FourSum {
//  18. 4Sum
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        int target = 8;
        System.out.println(fourSum(nums, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j < nums.length; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int temp = target - nums[i] - nums[j], x = j + 1, y = nums.length - 1;
                while (x < y) {
                    if (nums[x] + nums[y] == temp) {
                        List<Integer> arrayList = new ArrayList<>();
                        arrayList.add(nums[i]);
                        arrayList.add(nums[j]);
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
                    }else if(nums[x] + nums[y] > temp){
                        y--;
                    }else{
                        x++;
                    }
                }
            }
        }

        return list;
    }
}
