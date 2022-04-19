package org.example.Math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n > 1) {
            int temp = 0;
            while (n > 0) {
                int num = n % 10;
                temp += num * num;
                n /= 10;
            }
            if (set.contains(temp)) {
                break;
            }
            n = temp;
            set.add(temp);
        }

        return n == 1;
    }
}
