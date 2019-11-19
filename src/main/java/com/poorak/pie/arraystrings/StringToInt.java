package com.poorak.pie.arraystrings;

public class StringToInt {
    public int parseInt(String str) {
        boolean isNeg = str.charAt(0) == '-' ? true : false;
        int i = isNeg ? 1 : 0;
        int num = 0;
        while (i < str.length()) {
            num = num * 10;
            num = num + str.charAt(i) - '0';
            i++;
        }
        return isNeg ? -1 * num : num;
    }

    public String toInteger(int num) {
        boolean isNeg = false;
        if (num < 0) {
            isNeg = true;
            num = -num;
        }
        int i = 0;
        char[] temp = new char[10];
        while (num != 0) {
            temp[i++] = (char) ((num % 10) + '0');
            num = num/10;
        }
        StringBuilder sb = new StringBuilder();
        if(isNeg) sb.append('-');
        while(i>0) sb.append(temp[--i]);
        return sb.toString();
    }
}
