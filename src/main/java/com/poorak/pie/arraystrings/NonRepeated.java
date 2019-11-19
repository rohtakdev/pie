package com.poorak.pie.arraystrings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeated {
    public Character find(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character c :
                s.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return null;
    }
}
