package org.example.String;

import java.util.Arrays;

public class PlusOne {
    //66. Plus One
    public static void main(String[] args) {
        int[] digits = new int[]{9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }
}
