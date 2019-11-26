package com.poorak.pie.recursion;

public class StringPermutation {
    public void print(String str) {
        if (str == null) return;
        if (str.isEmpty()) return;
        boolean[] used = new boolean[str.length()];
        StringBuilder out = new StringBuilder();
        print(str, used, out);
    }

    /**
     * Sample output
     * <p>
     * hat
     * hta
     * aht
     * ath
     * tha
     * tah
     * </p>
     */
    private void print(String str, boolean[] used, StringBuilder out) {
        if (out.length() == str.length()) {
            System.out.println(out);
            return;
        }
        for (int i = 0; i < str.length(); ++i) {
            if (used[i]) continue;
            out.append(str.charAt(i));
            used[i] = true;
            print(str, used, out);
            used[i] = false;
            out.setLength(out.length() - 1);
        }
    }
}
