package org.example.String;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    //22.Generate Parentheses
    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        System.out.println(list);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String temp = "";
        loop(list, temp, 0, 0, n);
        return list;
    }

    private static void loop(List<String> list, String temp, int i, int j, int n) {
        if (temp.length() == 2*n)
            list.add(temp);
        else {
            if (i < n)
                loop(list, temp + "(", i+1, j, n);
            if (i > j && j < n)
                loop(list, temp + ")", i, j+1, n);
        }
    }

}
