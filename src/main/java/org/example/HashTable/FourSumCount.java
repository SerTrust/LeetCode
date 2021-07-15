package org.example.HashTable;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {

    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {-2,-1}, nums3 = {-1,2}, nums4 = {0,2};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap();
        int count = 0;
        for (int a : nums1){
            for (int b : nums2){
                if (map.containsKey(a+b))
                    map.put(a+b, map.get(a+b)+1);
                else
                    map.put(a+b, 1);
            }
        }

        for (int c : nums3){
            for (int d : nums4){
                if(map.containsKey(-(c+d)))
                    count += map.get(-(c+d));
            }
        }

        return count;
    }

    public static int fourSumCount2(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int count = map.getOrDefault(nums1[i] + nums2[j], 0);
                map.put(nums1[i] + nums2[j], count+1);
            }
        }
        int res=0;
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                res+= map.getOrDefault(-nums3[i] -nums4[j], 0);
            }
        }
        return res;
    }
}
