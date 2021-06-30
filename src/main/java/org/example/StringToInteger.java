package org.example;

public class StringToInteger {

    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483647"));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        int len = s.length();
        int result = 0;
        int sign = 1;
        for (int i = 0; i < len ; i++) {
            if ((s.charAt(i) == '+' || s.charAt(i) == '-') && i==0 ) {
                if (s.charAt(i) == '-') sign = -1;
                continue;
            }
            if(s.charAt(i)-48>=0 && s.charAt(i)-48<=9){
                System.out.println(result+"==="+Integer.MAX_VALUE/10);
                if((result >= Integer.MAX_VALUE/10 && (s.charAt(i)-48) > Integer.MAX_VALUE%10)
                    || (result > Integer.MAX_VALUE/10 && (s.charAt(i)-48) >= 0)){
                    if(sign == 1) result = Integer.MAX_VALUE;
                    else result = Integer.MIN_VALUE;
                    break;
                }
                result = result * 10 + (s.charAt(i)-48);
            }else{
                break;
            }
        }
        return result * sign;
    }
}
