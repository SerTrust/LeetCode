package org.example;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix2(str));
    }

    /**
     * 效率100%
     * @param strs
     * @return
     */
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    /**
     * 效率35%
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(len==0) return "";
        if(len==1) return strs[0];
        StringBuilder start = new StringBuilder();
        int i = 0;
        boolean boo = true;
        while(i<strs[0].length()){
            String tempStart = strs[0].substring(0,i+1);
            int x=0;
            while(x<len){
                if(!strs[x].startsWith(tempStart)) {
                    boo = false;
                    break;
                }
                x++;
            }
            if(boo){
                i++;
                start.setLength(0);
                start.append(tempStart);
            }else{
                break;
            }
        }
        return start.toString();
    }
}
