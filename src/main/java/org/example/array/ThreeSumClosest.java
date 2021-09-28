package org.example.array;

import java.util.Arrays;

public class ThreeSumClosest {
//  16. 3Sum Closest
    public static void main(String[] args) {
        int[] nums = {1,1,-1,-1,3};
        int target = -1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE/2;
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length-2; i++) {
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int x = i+1, y = length-1;
            while (x < y){
                int sum = nums[i] + nums[x] + nums[y];
                if (sum == target)
                    return sum;
                else if (Math.abs(target - sum) < Math.abs(target - result))
                    result = sum;

                if (sum < target)
                    x++;
                if (sum > target)
                    y--;
            }
        }
        return result;
    }

//    public static int threeSumClosest(int[] nums, int target) {
//        int size = nums.length;
//        int result = 10000;
//        for (int i = 0; i < size-2; i++) {
//            if (i > 0 && nums[i] == nums[i-1]) continue;
//            for (int j = i+1; j < size-1; j++) {
//                if(j > i+2 && nums[j] == nums[j-1])
//                    continue;
//                int y = j+1;
//                while (y < size){
//                    int sum = nums[i] + nums[j] + nums[y];
//                    if (Math.abs(target - sum) < Math.abs(target - result))
//                        result = sum;
//                    y++;
//                    if (y < size && nums[y] == nums[y-1]){
//                        y++;
//                    }
//                }
//            }
//        }
//
//        return result;
//    }
}
