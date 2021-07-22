package org.example.String;

public class RepeatedSubstringPattern {
//  459. Repeated Substring Pattern
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        if (s.length() < 2) return false;
        int index = 1;
        while (index <= s.length()/2){
            if (s.length() % index != 0){
                index++;
                continue;
            }
            String construct = s.substring(0, index);
            if ("".equals(s.replaceAll(construct, "")))
                return true;
            else
                index++;
        }

        return false;
    }

    public boolean repeatedSubstringPattern2(String s) {
        if (s.equals("")) return false;

        int len = s.length();
        s = " " + s;
        char[] chars = s.toCharArray();
        int[] next = new int[len + 1];

        for (int i = 2, j = 0; i <= len; i++) {
            while (j > 0 && chars[i] != chars[j + 1]) j = next[j];
            if (chars[i] == chars[j + 1]) j++;
            next[i] = j;
        }

        if (next[len] > 0 && len % (len - next[len]) == 0) {
            return true;
        }
        return false;
    }
}
