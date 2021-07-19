package org.example.HashTable;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {
//  202. Happy Number
    public static void main(String[] args) {
        System.out.println(isHappy(1111111));
    }

    public static boolean isHappy(int n) {
        Set set = new HashSet<Integer>();
        while(n > 1){
            int result = 0;
            while(n > 0){
                int num = n%10;
                result += num * num;
                n /= 10;
            }
            if (set.contains(result)){
                break;
            }
            n = result;
            set.add(result);
        }
        return n == 1;
    }
}
