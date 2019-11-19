package com.poorak.pie.arraystrings;

/**
 * Start from end of string, recognize a  word, append this word to the beginning of a new string.
 * continue copying all words delimited by space except when char is not space.
 */
public class ReverseWords {
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        int s= 0;
        for (int i = str.length()-1; i >= 0;i-- ) {
            if (str.charAt(i) == ' ' || i ==0 ) {
                int j = i ==0 ? i :i+1;
                // copy now
                for( ; j<= i+s  ;j++){
                    sb.append(str.charAt(j));
                }
                if(str.charAt(i) == ' ') sb.append(str.charAt(i));
                s = 0;
            } else s++;
        }
        return sb.toString();
    }

    public char[] reverse2(String str) {
        char[] chars = str.toCharArray();
        reverseString(chars, 0, str.length()-1);
        int i = 0, j=0;
        while(i< chars.length && j != chars.length){
            if(chars[i] != ' '){
                i++;
            }else{
                reverseString(chars, j, i-1);
                i++;
                j= i;
            }
        }
        reverseString(chars, j, i-1);
        return chars;
    }

    public void reverseString(char[] chars, int start, int end){
        while(end>start){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            end--;
            start++;
        }
    }
}
