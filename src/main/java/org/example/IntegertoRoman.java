package org.example;

public class IntegertoRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(45));
    }

    public static String intToRoman(int num) {
        int[] nums = {1000,500,100,50,10,5,1};
        String[] codes = {"M","D","C","L","X","V","I"};
        StringBuffer result = new StringBuffer();
        int i = 0;
        while(num>0){
            int a = num/nums[i];
            int b = num%nums[i];
            if( a>0 && a<4 ) {
                for (int j = 0; j < a; j++) {
                    result.append(codes[i]);
                }
            }
            if(a == 4){
                result.append(codes[i] + codes[i-1]);
            }if(a > 5 && a < 9){
                result.append(codes[i-1]);
                for (int j = 5; j < a; j++) {
                    result.append(codes[i]);
                }
            }
            if(i+2< codes.length && i%2==0) {
                if (b >= nums[i] - nums[i + 2]) {
                    result.append(codes[i + 2] + codes[i]);
                    b = b - nums[i] + nums[i + 2];
                }
            }
            i++;
            num = b;
        }
        return result.toString();
    }
}
