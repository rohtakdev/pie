package com.poorak.pie.recursion;

public class Factorial {
    public int factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }

    public int factorial_i(int n) {
        if (n == 0 || n == 1) return 1;
        int f = 1;
        while (n > 1) {
            f = f * n;
            n--;
        }
        return f;
    }
}
