package org.example;

import java.util.HashSet;
import java.util.Set;

public class WeirdPrimeTest {

    public static void main(String[] args) {
        System.out.println(countOnes(10));
        System.out.println(countOnes(100));
//        System.out.println(maxPn(5));
//        System.out.println(maxPn(7));
        System.out.println(anOverAverage(5));
    }

    public static long countOnes(long n) {
        long start = 7;
        long add = 2;
        long sum = 1;
        while(add<=n){
            long num = start + gcd(start,add++);
            long d = num - start;
            if(d==1) sum++;
            start = num;
        }
        return sum;
    }
    public static long maxPn(long n) {
        Set<Long> set = new HashSet<>();
        long start = 7;
        long add = 2;
        long count = 0;
        long max = 0;
        while(count<n){
            long num = start + gcd(start,add++);
            long d = num - start;
            if(d!=1 && set.contains(d)==false){
                set.add(d);
                count++;
                if(d>max) max=d;
            }
            start = num;
        }
        return max;
    }
    public static int anOverAverage(long n) {
        long start = 7;
        long add = 2;
        long count = 0;
        long sum = 0;
        while(count<n){
            long num = start + gcd(start,add);
            long d = num - start;
            if(d!=1){
                sum += num/add;
                count++;
            }
            add++;
            start = num;
        }
        return (int) (sum/count);
    }

    public static long gcd(long m,long n){
        long a = Math.max(m,n);
        long b = Math.min(m,n);
        if(b==0) return a;
        else return gcd(a%b,b);
    }
}
