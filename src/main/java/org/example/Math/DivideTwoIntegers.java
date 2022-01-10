package org.example.Math;

public class DivideTwoIntegers {

//    29. Divide Two Integers
    public static void main(String[] args) {
        int a = -2147483648, b = -1;
        System.out.println(divide(a, b));
    }

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

    public int divide2(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        long result = 0;
        int flag = ((dividend > 0) ^ (divisor > 0)) ? 1 : -1;
        long dvd = dividend;
        long dvs = divisor;
        dvd = Math.abs(dvd);
        dvs = Math.abs(dvs);
        while(dvd >= dvs) {
            long temp = dvs;
            int shiftTime = 0;
            while(dvd >= temp << 1) {
                temp = temp << 1;
                shiftTime ++;
            }
            result += Math.pow(2, shiftTime);
            dvd -= temp;
        }
        return (int) ((flag == 1) ? (-1) * result : result);
    }

}
