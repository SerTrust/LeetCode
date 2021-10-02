package org.example.String;

import java.util.*;
import java.util.stream.Stream;

public class PhoneNumber {
//  17. Letter Combinations of a Phone Number
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        int length = digits.length();
        List<String> list = new ArrayList<>();
        if (length == 0)
            return list;

        int index = 0;
        while (index < length){
            String[] letters = getLetter(digits.substring(index, index + 1));
            if (list.size() == 0){
                for (String letter : letters) {
                    list.add(letter);
                }
            }else {
                List<String> temp = new ArrayList<>();
                for (String s : list) {
                    for (String letter : letters) {
                        temp.add(s+letter);
                    }
                }
                list = temp;
            }
            index++;
        }

        return list;
    }

    private static String[] getLetter(String num){
        switch (num){
            case "2":
                return new String[]{"a", "b", "c"};
            case "3":
                return new String[]{"d", "e", "f"};
            case "4":
                return new String[]{"g", "h", "i"};
            case "5":
                return new String[]{"j", "k", "l"};
            case "6":
                return new String[]{"m", "n", "o"};
            case "7":
                return new String[]{"p", "q", "r", "s"};
            case "8":
                return new String[]{"t", "u", "v"};
            case "9":
                return new String[]{"w", "x", "y", "z"};
            default:
                return null;
        }
    }
}
