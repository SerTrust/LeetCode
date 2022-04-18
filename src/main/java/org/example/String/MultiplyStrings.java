package org.example.String;

import java.util.Arrays;

public class MultiplyStrings {
    // 43. Multiply Strings
    public static void main(String[] args) {
        String num1 = "123", num2 = "456";
        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int[] arr = new int[num1.length()+num2.length()];

        for (int i = num1.length()-1; i >= 0; i--) {
            int c1 = num1.charAt(i) - 48;
            for (int j = num2.length()-1; j >= 0; j--) {
                int c2 = num2.charAt(j) - 48;
                int rs = arr[i+j+1];
                int mul = c1 * c2 + rs;
                arr[i+j+1] = mul % 10;
                arr[i+j] += mul / 10;
            }
        }

        String result = Arrays.stream(arr).mapToObj(String::valueOf).reduce(String::concat).get();
        while (result.startsWith("0"))
            result = result.substring(1);
        return result;
    }
}
