package com.poorak.pie.recursion;

public class PhoneNumber {
    public void print(int[] num){
        if(num.length > 0 ) print(num, 0, new char[]{});
    }

    private void print(int[] phoneNum, int currDigit, char[] chars) {
        if(currDigit == 7) {
            System.out.println(chars);
            return;
        }

        for(int j=1; j<=3;j++){
            chars[currDigit] = getCharKey(phoneNum[currDigit], j);
            print(phoneNum, currDigit+1, chars);
            if(phoneNum[currDigit] == 0 || phoneNum[currDigit] == 1) return;
        }
    }

    private char getCharKey(int i, int j) {
        return 0;
    }
}
