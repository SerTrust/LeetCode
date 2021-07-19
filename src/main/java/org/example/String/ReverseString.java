package org.example.String;

import java.util.Arrays;

public class ReverseString {
//  344. Reverse String
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s){
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[s.length-i-1];
            s[s.length-i-1] = s[i];
            s[i] = temp;
        }
    }
}
