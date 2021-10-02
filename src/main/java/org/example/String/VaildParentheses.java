package org.example.String;

import java.util.Stack;

public class VaildParentheses {
//  20.Vaild Parentheses
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        if (s.length()%2 == 1)
            return false;

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i+1).equals("(")){
                stack.push(")");
            } else if (s.substring(i, i+1).equals("[")){
                stack.push("]");
            } else if (s.substring(i, i+1).equals("{")){
                stack.push("}");
            } else {
                if (stack.size() == 0 || !s.substring(i, i+1).equals(stack.pop()))
                    return false;
            }
        }
        return stack.size() == 0;
    }
}
