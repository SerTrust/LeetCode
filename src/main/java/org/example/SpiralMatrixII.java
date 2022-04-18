package org.example;

public class SpiralMatrixII {

    //59. Spiral Matrix II
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateMatrix(n));
    }

    public static int[][] generateMatrix(int n) {
        int[][] ints = new int[n][n];
        int x = 0, y = 0, loop = n/2, add = n-1, count = 1;

        while (loop>0){
            int i = x, j = y;

            for (; i < x+add; i++) {
                ints[j][i] = count++;
            }
            for (; j < y+add; j++) {
                ints[j][i] = count++;
            }
            for (; i > x; i--) {
                ints[j][i] = count++;
            }
            for (; j > y; j--) {
                ints[j][i] = count++;
            }
            x++;
            y++;
            add -= 2;
            loop--;
        }
        if(n%2 == 1) ints[n/2][n/2] = count;
        return ints;
    }
}
