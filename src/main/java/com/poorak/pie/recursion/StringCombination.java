package com.poorak.pie.recursion;

public class StringCombination {
    public void combine(String str) {
        if (str != null || !str.isEmpty()) {
            combine(str, 0, new StringBuilder());
        }
    }

    /**
     * Sample output
     * <p>
     * w
     * wx
     * wxy
     * wxyz
     * wxz
     * wy
     * wyz
     * wz
     * x
     * xy
     * xyz
     * xz
     * y
     * yz
     * z
     * </p>
     */
    private void combine(String str, int pos, StringBuilder out) {
        for (int i = pos; i < str.length(); ++i) {
            out.append(str.charAt(i));
            System.out.println(out);
            if (i < str.length())
                combine(str, i + 1, out);
            out.setLength(out.length() - 1);
        }
    }
}
