package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class WeightTest {

    public static void main(String[] args) {
        String str = "56 65 74 100 99 68 86 180 90";
        System.out.println(orderWeight(str));
    }

    public static String orderWeight(String strng){
        String[] array = strng.split(" ");
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int a = o1.chars().map( c -> Character.getNumericValue(c)).sum();
                int b = o2.chars().map( c -> Character.getNumericValue(c)).sum();
                return a-b != 0? a-b : o1.compareTo(o2);
            }
        });
        return String.join(" ",array);
    }
}
