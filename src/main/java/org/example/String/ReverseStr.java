package org.example.String;

public class ReverseStr {
//  541. Reverse String II
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int start = 0, len = s.length();
        while (start < len){
            int a = start + k < len ? start + k : len;
            int b = start + 2*k < len ? start + 2*k : len;

            StringBuilder temp = new StringBuilder(s.substring(start, a));
            sb.append(temp.reverse());
            if (b > a) sb.append(s.substring(a, b));

            start += 2*k;
        }

        return sb.toString();
    }
}
