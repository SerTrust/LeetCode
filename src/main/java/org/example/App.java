package org.example;

import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] nums1 = {0,0};
        int[] nums2 = {0,0};
        int[] ints = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).sorted().toArray();
        int n = ints.length;
        double rs = n%2!=0?ints[(n-1)/2]:(ints[(n-1)/2]+ints[(n-1)/2+1])/2.0;
        System.out.println(ints[(n-1)/2]+"--"+ints[(n-1)/2+1]);
        System.out.println(rs);
    }
}
