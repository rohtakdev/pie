package com.poorak.pie.arraystrings;

import java.util.HashSet;
import java.util.Set;

public class RemoveChars {
    public String remove(String str, String remove) {
        if (str == null) return null;
        if (remove == null) return str;
        Set<Character> s = new HashSet<>(remove.length());
        for (char c :
                remove.toCharArray()) {
            s.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!s.contains(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public void remove(StringBuilder str, String remove) {
        boolean[] flag = new boolean[128];
        for (int i = 0; i < remove.length(); i++) flag[remove.charAt(i)] = true;
        int dst = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!flag[str.charAt(i)]) {
                str.setCharAt(dst++, str.charAt(i));
            }
        }
        str.setLength(dst);
        return;
    }
}
