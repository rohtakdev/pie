package com.poorak.pie.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringPermutationTest {
    private StringPermutation stringPermutation;

    @BeforeEach
    void setUp() {
        stringPermutation = new StringPermutation();

    }

    @Test
    void print() {
        stringPermutation.print("hat");
    }
}