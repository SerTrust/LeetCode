package org.example.String;

public class ReverseWords {
//  151. Reverse Words in a String
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int end = s.length();
        for (int i = s.length()-1; i >= 0; i--) {
            if (" ".equals(s.substring(i, i+1))){
                if(s.charAt(i) != s.charAt(i+1)) {
                    sb.append(s.substring(i + 1, end)).append(" ");
                }
                end = i;
            }
        }

        return sb.append(s.substring(0, end)).toString();
    }
}
