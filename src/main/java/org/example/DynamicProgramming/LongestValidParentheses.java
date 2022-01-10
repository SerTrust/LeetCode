package org.example.DynamicProgramming;

import java.util.Queue;
import java.util.Stack;

public class LongestValidParentheses {
//    32. Longest Valid Parentheses
    public static void main(String[] args) {
        String str = ")()())";
        System.out.println(longestValidParentheses2(str));
    }

//    Runtime: 2008 ms, faster than 5.01% of Java online submissions for Longest Valid Parentheses.
//    Memory Usage: 39.4 MB, less than 35.59% of Java online submissions for Longest Valid Parentheses.
    public static int longestValidParentheses(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = 0;
            if (s.charAt(i) == '('){
                len++;
                for (int j = i+1; j < s.length(); j++) {
                    if (s.charAt(j) == '(') {
                        len++;
                    }else {
                        len--;
                    }
                    if (len == 0) {
                        result = Math.max(result, j - i + 1);
                    }
                    if (len < 0) {
                        break;
                    }
                }
            }
        }
        return result;
    }

//    Runtime: 5 ms, faster than 24.44% of Java online submissions for Longest Valid Parentheses.
//    Memory Usage: 40.4 MB, less than 14.66% of Java online submissions for Longest Valid Parentheses.
    public static int longestValidParentheses2(String s) {
        int start = 0, result = 0;
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add(i);
            }else if (s.charAt(i) == ')') {
                if (stack.empty()) {
                    start = i + 1;
                }else {
                    stack.pop();
                    result = stack.isEmpty() ? Math.max(result, i - start +1) : Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }
}
