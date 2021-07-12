package org.example.HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ints = new int[2];
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                ints[0] = map.get(nums[i]);
                ints[1] = i;
                return ints;
            }
            map.put(target - nums[i], i);
        }
        return ints;
    }
}
