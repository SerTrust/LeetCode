package org.example.String;

public class StrStr {
//  28. Implement strStr()
    public static void main(String[] args) {
        String haystack = "hello", needle = "aa";
        System.out.println(strStr2(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int a = haystack.length(), b = needle.length();
        int i = 0, j = 0;
        while(i < a - b + 1){
            while (i < a && j < b && haystack.charAt(i) == needle.charAt(j)){
                i++;j++;
            }
            if (j == b) return i - j;
            i -= j - 1;
            j = 0;
        }

        return -1;
    }

    public static int strStr2(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i+needle.length()).equals(needle)) return i;
        }

        return -1;
    }
}
