package org.example;

public class Unicode {

    public static void main(String[] args) {
        String str = "烟花颱風";
        System.out.println(unicode(str));
        String code = "\\u70df\\u82b1\\u98b1\\u98a8";
        System.out.println(decodeUnicode(code));
    }

    public static String unicode(String str){
        StringBuilder unicode = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            unicode.append("\\u"+Integer.toHexString(c));
        }
        return unicode.toString();
    }

    public static String decodeUnicode(String code){
        StringBuilder str = new StringBuilder();
        String[] strs = code.split("\\\\u");
        for (int i = 1; i < strs.length; i++) {
            str.append((char) Integer.valueOf(strs[i], 16).intValue());
        }
        return str.toString();
    }
}
