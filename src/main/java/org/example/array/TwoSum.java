package org.example.array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(1, listNode);
        System.out.println(isPalindrome(listNode1));
    }

    /**
     * 判斷ListNode是否有對稱
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        while(i<list.size()/2){
            if(!list.get(i).equals(list.get(list.size()-1-i))) return false;
            i++;
        }
        return true;
    }

    /**
     * 判斷數字是否左右對稱
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int i = 0;
        while(i<chars.length){
            if(chars[i]!=chars[chars.length-1-i]) return false;
            i++;
        }
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i]!=chars[chars.length-1-i]) return false;
//        }
        return true;
    }

    /**
     * 不使用BigInteger,計算兩大數相乘
     * @param num1
     * @param num2
     * @return
     */
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int numLenght = num1.length(),numLenght2 = num2.length();
        int[] c1=num1.chars().toArray(),c2=num2.chars().toArray();
        int[] result = new int[numLenght + numLenght2];

        for (int i = numLenght; i > 0; i--) {
            int x = c1[i-1]-48;
            for (int j = numLenght2; j > 0; j--) {
                int y = c2[j-1]-48;
                int rs = result[i+j-1];
                int mul = (x * y + rs) % 10;
                int next = (x * y + rs) / 10;
                result[i+j-1] = mul;
                result[i+j-2] += next;
            }
        }

        String rs = Arrays.stream(result).mapToObj(String::valueOf).reduce(String::concat).get();
        while(rs.startsWith("0")) rs = rs.substring(1);
        return rs;
    }

    /**
     * 將int[]轉成BigInteger後加1,之後轉成int[]回傳
     * 註：回傳int[]的長度需與digits相同
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        BigInteger bi = new BigInteger(Arrays.stream(digits).mapToObj(s -> String.valueOf(s)).reduce(String::concat).get());
        return String.format("%0"+digits.length+"d",bi.add(BigInteger.valueOf(1))).chars().map(c->c-48).toArray();
    }

    /**
     * 將int[]轉成BigInteger後加K,之後轉成List<Integer>回傳
     * @param A
     * @param K
     * @return
     */
    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        String Astr = Arrays.stream(A).mapToObj(s -> String.valueOf(s)).reduce(String::concat).get();
        BigInteger bi = new BigInteger(Astr);
        for (char c : bi.add(BigInteger.valueOf(K)).toString().toCharArray()) {
            list.add(Integer.parseInt(c+""));
        }
        return list;
    }

    /**
     * 將兩大數相加
     * @param num1
     * @param num2
     * @return
     */
    public static String addStrings(String num1, String num2) {
        return Arrays.asList(new BigInteger(num1),new BigInteger(num2)).stream().reduce(BigInteger::add).get().toString();
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 使用ListNode計算兩數相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1,q = l2,tempNode = result;
        int next = 0;
        while (p != null || q != null || next != 0){
            int pval = p != null?p.val:0;
            int qval = q != null?q.val:0;
            int val = (pval + qval + next)%10;
            next = (pval + qval + next)/10;
            ListNode list = new ListNode(val);
            tempNode.next = list;
            tempNode = list;
            p = p != null?p.next:null;
            q = q != null?q.next:null;
        }
        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}