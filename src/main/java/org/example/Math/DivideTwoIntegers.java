package org.example.Math;

public class DivideTwoIntegers {

//    29. Divide Two Integers
    public static void main(String[] args) {
        int a = -2147483648, b = -1;
        System.out.println(divide(a, b));
    }

//    Runtime: 1 ms, faster than 100.00% of Java online submissions for Divide Two Integers.
//    Memory Usage: 36.2 MB, less than 59.49% of Java online submissions for Divide Two Integers.
    public static int divide(int dividend, int divisor) {
        boolean isNegative = false;
        long result = 0;
        long dividendLong = dividend;
        long divisorLong = divisor;
        if (dividendLong < 0) {
            isNegative = !isNegative;
            dividendLong = 0 - dividendLong;
        }
        if (divisorLong < 0) {
            isNegative = !isNegative;
            divisorLong = 0 - divisorLong;
        }

        while (dividendLong >= divisorLong) {
            long temp = divisorLong;
            int shiftTime = 0;
            while(dividendLong >= temp << 1) {
                temp = temp << 1;
                shiftTime ++;
            }
            result += Math.pow(2, shiftTime);
            dividendLong -= temp;
        }

        if (isNegative) {
            return result > Integer.MAX_VALUE ? Integer.MIN_VALUE : (int)(result * (-1));
        }else {
            return result >= Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)result;
        }
    }
}
