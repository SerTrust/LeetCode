package org.example;

public class PalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("vvdgghtfgretvbkliursavbnjhyvdvds"));
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        int start = 0;
        int end = 0;
        for (int i = 0; i < len; i++) {
            int tempLen1 = getTempLen(s,i,i);
            int tempLen2 = getTempLen(s,i,i+1);
            int tempLen = Math.max(tempLen1,tempLen2);
            if(tempLen>end-start+1){
                if(tempLen%2==0) start = i - tempLen/2 + 1;
                else start = i - tempLen/2;
                end = i + tempLen/2;
            }
        }
        return s.substring(start,end+1);
    }

    public static int getTempLen(String s, int tempStart, int tempEnd){
        while (tempStart<=tempEnd && tempStart>=0 && tempEnd<s.length()){
            if (s.charAt(tempStart)==s.charAt(tempEnd)){
                tempStart--;tempEnd++;
            }else{
                break;
            }
        }
        return tempEnd - tempStart - 1;
    }
}
