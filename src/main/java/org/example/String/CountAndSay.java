package org.example.String;

// 38. Count and Say
public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if (n <= 1) return "1";

        String say = "1";
        for (int i = 1; i < n; i++) {
            String sayTemp = "";
            for (int j = 0; j < say.length(); j++) {
                int count = 1;
                while (j+count < say.length() && say.charAt(j) == say.charAt(j+1)) {
                    count++;
                    j++;
                }
                sayTemp += (count + String.valueOf(say.charAt(j)));
            }
            say = sayTemp;
        }

        return say;
    }
}
