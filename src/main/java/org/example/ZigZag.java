package org.example;

public class ZigZag {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }

    public static String convert(String s, int numRows) {
        if(numRows==1) return s;

        char[] chars = s.toCharArray();
        int len = chars.length;
        int add = (numRows-1)*2;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; i+j < len; j += add) {
                result.append(chars[i+j]);
                if(i!=0 && i!=numRows-1 && j+add-i<len) result.append(chars[j+add-i]);
            }
        }
        return result.toString();
    }
}
