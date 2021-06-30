package org.example.array;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums.length == 1 && nums[i] == 0) break;
            int target = 0 - nums[i], x = i + 1, y = nums.length - 1;
            while (x < y) {
                if (nums[x] + nums[y] == target) {
                    List<Integer> arrayList = new LinkedList<>();
                    arrayList.add(nums[i]);
                    arrayList.add(nums[x]);
                    arrayList.add(nums[y]);
                    if (list.indexOf(arrayList) < 0)
                        list.add(arrayList);
                    y--;x++;
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
