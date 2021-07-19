package org.example.array;

import java.util.stream.IntStream;

public class SortedArrays {
//  4. Median of Two Sorted Arrays
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        System.out.println(getMedian2(nums1,nums2));
    }
    //浪費效能
    public static double getMedian(int[] nums1,int[] nums2){
        int[] ints = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).sorted().toArray();
        int n = ints.length;
        return n%2!=0?ints[(n-1)/2]:(ints[(n-1)/2]+ints[(n-1)/2+1])/2.0;
    }
    //節省效能
    public static double getMedian2(int[] nums1,int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int[] ints = new int[m + n];
        int a=0,b=0;
        for (int i = 0; i < ints.length; i++) {
            if (a < m && b < n) {
                if(nums1[a]<nums2[b]){
                    ints[i] = nums1[a];
                    a++;
                }else{
                    ints[i] = nums2[b];
                    b++;
                }
            }else if(a<m){
                ints[i] = nums1[a];
                a++;
            }else if(b<n){
                ints[i] = nums2[b];
                b++;
            }
        }
        if((m+n)%2!=0) return ints[(m+n)/2];
        else return (ints[(m+n)/2]+ints[(m+n)/2-1])/2.0;
    }
}
